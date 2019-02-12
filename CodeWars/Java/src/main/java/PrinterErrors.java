public final class PrinterErrors {
    private final static int MIN_PRINTER_CHARACTER = 'a';
    private final static int MAX_PRINTER_CHARACTER = 'm';

    public static String printerError(String s) {
        long errorCount = s.chars()
                .filter(c -> c < MIN_PRINTER_CHARACTER || c > MAX_PRINTER_CHARACTER)
                .count();

        return String.format("%s/%s", errorCount, s.length());
    }

    // Another clean solution
    // public static String printerError(String s) {
    //     return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    // }
}
