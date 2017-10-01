using System;
using System.Collections.Generic;
using System.Linq;
using System.Numerics;
using System.Text.RegularExpressions;

namespace IbanValidation
{
    public class IbanValidator
    {
        private static readonly Dictionary<string, int> CountryCodeData = new Dictionary<string, int>
        {
            {"AL", 28},
            {"AD", 24},
            {"AT", 20},
            {"AZ", 28},
            {"BE", 16},
            {"BH", 22},
            {"BA", 20},
            {"BR", 29},
            {"BG", 22},
            {"CR", 21},
            {"HR", 21},
            {"CY", 28},
            {"CZ", 24},
            {"DK", 18},
            {"DO", 28},
            {"EE", 20},
            {"FO", 18},
            {"FI", 18},
            {"FR", 27},
            {"GE", 22},
            {"DE", 22},
            {"GI", 23},
            {"GR", 27},
            {"GL", 18},
            {"GT", 28},
            {"HU", 28},
            {"IS", 26},
            {"IE", 22},
            {"IL", 23},
            {"IT", 27},
            {"KZ", 20},
            {"KW", 30},
            {"LV", 21},
            {"LB", 28},
            {"LI", 21},
            {"LT", 20},
            {"LU", 20},
            {"MK", 19},
            {"MT", 31},
            {"MR", 27},
            {"MU", 30},
            {"MC", 27},
            {"MD", 24},
            {"ME", 22},
            {"NL", 18},
            {"NO", 15},
            {"PK", 24},
            {"PS", 29},
            {"PL", 28},
            {"PT", 25},
            {"RO", 24},
            {"SM", 27},
            {"SA", 24},
            {"RS", 22},
            {"SK", 24},
            {"SI", 19},
            {"ES", 24},
            {"SE", 24},
            {"CH", 21},
            {"TN", 24},
            {"TR", 26},
            {"AE", 23},
            {"GB", 22},
            {"VG", 24}
        };

        public static ValidationResult Validate(string value)
        {
            if (string.IsNullOrEmpty(value)) throw new NullReferenceException(nameof(value));
            value = Regex.Replace(value, " ", "");
            if (!Regex.IsMatch(value, @"^[0-9A-Z]*$")) return ValidationResult.InvalidChars;

            var countryCodeLength =
                CountryCodeData.GetValueOrDefault(value.Substring(0, 2), -1);

            // If countryCodeLength is less than zero
            // the code was not found.
            if (countryCodeLength < 0) return ValidationResult.UnknownCountryCode;
            if (countryCodeLength > value.Length) return ValidationResult.ValueLengthTooSmall;
            if (countryCodeLength < value.Length) return ValidationResult.ValueLengthTooLarge;

            var shiftedIban = ShiftString(value, 4);
            return ConvertIbanToInt(shiftedIban) % 97 == 1 ?
                ValidationResult.IsValid : ValidationResult.NotValid;
        }

        private static string ShiftString(string value, int shiftCount)
        {
            return value.Substring(shiftCount, value.Length - shiftCount)
                + value.Substring(0, shiftCount);
        }

        private static BigInteger ConvertIbanToInt(string value)
        {
            var numbers = value.ToCharArray()
                .Select(MapIbanCharToInt);
            return BigInteger.Parse(string.Join("", numbers));
        }

        // Only useful if value has already been checked
        // for invalid characters.
        private static int MapIbanCharToInt(char character)
        {
            return (character >= 65 ? character - 55 : character - '0');
        }
    }
}