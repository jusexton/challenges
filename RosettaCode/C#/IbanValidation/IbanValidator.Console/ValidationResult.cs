namespace IbanValidation
{
    public enum ValidationResult
    {
        InvalidChars,
        UnknownCountryCode,
        ValueLengthTooSmall,
        ValueLengthTooLarge,
        IsValid,
        NotValid
    }
}