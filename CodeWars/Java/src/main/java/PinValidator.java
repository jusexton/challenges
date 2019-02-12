public final class PinValidator {
    // public static boolean validatePin(String pin) {
    //     return java.util.regex.Pattern.compile("^\\d{4}$|^\\d{6}$").matcher(pin).matches();
    // }

    public static boolean validatePin(String pin) {
        return pin.matches("^\\d{4}$|^\\d{6}$");
    }
}
