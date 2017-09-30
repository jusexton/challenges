using System;
using IbanValidation;
using Xunit;

namespace IbanValidator.Tests
{
    public class ValidateMethodTests
    {
        private static readonly string ValidIban = "DE44 5001 0517 5407 3249 31";
        private static readonly string InvalidCharsIban = "DE44 500- 0517 5407 3249 31";
        private static readonly string UnknownCountryCodeIban = "UU44 5001 0517 5407 3249 31";
        private static readonly string ValueLengthTooSmallIban = "DE44 5001 0517 5407 3249 3";
        private static readonly string ValueLengthTooLargeIban = "DE44 5001 0517 5407 3249 319";

        [Fact]
        public void ShouldThrowNullReferenceExceptionWhenPassedNullOrEmpty()
        {
            Assert.Throws<NullReferenceException>(
                () => IbanValidation.IbanValidator.Validate(""));
        }

        [Fact]
        public void ShouldReturnInvalidCharsWhenInvalidCharsArePresent()
        {
            var expected = ValidationResult.InvalidChars;
            var actual = IbanValidation.IbanValidator.Validate(InvalidCharsIban);
            Assert.Equal(expected, actual);
        }

        [Fact]
        public void ShouldReturnUnknownCountryCodeWhenUnrecognizedCountryPrefixIsUsed()
        {
            var expected = ValidationResult.UnknownCountryCode;
            var actual = IbanValidation.IbanValidator.Validate(UnknownCountryCodeIban);
            Assert.Equal(expected, actual);
        }

        [Fact]
        public void ShouldReturnValueLengthTooSmallWhenTheValueLengthIsTooSmallForGivenCountryCode()
        {
            var expected = ValidationResult.ValueLengthTooSmall;
            var actual = IbanValidation.IbanValidator.Validate(ValueLengthTooSmallIban);
            Assert.Equal(expected, actual);
        }

        [Fact]
        public void ShouldReturnValueLEngthTooLargeWhenTheValueLengthIsTooLargeForTheGivenCountryCode()
        {
            var expected = ValidationResult.ValueLengthTooLarge;
            var actual = IbanValidation.IbanValidator.Validate(ValueLengthTooLargeIban);
            Assert.Equal(expected, actual);
        }

        [Fact]
        public void ShouldReturnIsValidWhenPassedAValidIban()
        {
            var expected = ValidationResult.IsValid;
            var actual = IbanValidation.IbanValidator.Validate(ValidIban);
            Assert.Equal(expected, actual);
        }
    }
}
