using System;

namespace IbanValidation
{
    internal class Program
    {
        private static readonly string[] IbanList =
        {
            "DE44 5001 0517 5407 3249 31",
            "GB82 WEST 1234 5698 7654 32"
        };

        private static void Main(string[] args)
        {
            foreach (var iban in IbanList)
            {
                var result = IbanValidator.Validate(iban);
                Console.WriteLine(result);
            }
        }
    }
}
