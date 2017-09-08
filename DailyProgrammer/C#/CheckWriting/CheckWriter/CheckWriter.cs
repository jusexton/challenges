using System;
using System.Globalization;
using System.Text;
using System.Text.RegularExpressions;

namespace CheckWriter
{
    public class CheckWriter
    {
        // TODO: Can be modified to accept generated
        // pattern and groups for even larger numbers.
        private static readonly string[] groups =
        {
            "trillion",
            "billion",
            "million",
            "thousand",
            "hundred",
            "cents"
        };
        private static readonly string pattern =
            @"^(?<trillion>\d{1,3})?(?<billion>\d{1,3})?(?<million>\d{1,3})?(?<thousand>\d{1,3})?(?<hundred>\d{1,3})(\.(?<cents>\d{2}))?$";
        private static readonly RegexOptions options = RegexOptions.RightToLeft;
        private Regex regex;

        public CheckWriter()
        {
            regex = new Regex(pattern, options);
        }

        public string BuildNumberTextOf(decimal value)
        {
            var valueStr = value.ToString("#.00", CultureInfo.InvariantCulture);
            var match = regex.Match(valueStr);

            var sb = new StringBuilder();
            foreach (var group in groups)
            {
                var capturedValue = match.Groups[group].Value.TrimStart(new char[] { '0' });

                // Dollars wont be appended to result if the 
                // hundred group contains all zeros.
                if (capturedValue == "" && group == "hundred")
                {
                    sb.Append("dollars ");
                    continue;
                }
                else if (capturedValue == "")
                {
                    continue;
                }
                else
                {
                    var words = HundredsToWords(Convert.ToInt32(capturedValue));

                    // Make sure "hundred" doesnt double up since
                    // "hundred" is also appended in the HundredsToWords
                    // function.
                    if (group != "hundred")
                    {
                        var cents = group == "cents" ? "and " : "";
                        sb.Append($"{cents}{words} {group} ");
                    }
                    else
                    {
                        sb.Append($"{words} dollars ");
                    }
                }
            }

            return sb.ToString().TrimEnd();
        }

        private string HundredsToWords(int number)
        {
            if (number > 999) throw new ArgumentOutOfRangeException("Passed value too large.");

            var sb = new StringBuilder();

            if ((number / 100) > 0)
            {
                sb.Append(HundredsToWords(number / 100) + " hundred ");
                number %= 100;
            }

            if (number > 0)
            {
                var units = new[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
                var tens = new[] { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

                if (number < 20)
                {
                    sb.Append(units[number]);
                }
                else
                {
                    var tenCount = number / 10;
                    var unitCount = number % 10;
                    sb.Append(tens[tenCount]);
                    if (unitCount > 0)
                    {
                        sb.Append("-" + units[unitCount]);
                    }
                }
            }

            return sb.ToString().TrimEnd();
        }
    }
}
