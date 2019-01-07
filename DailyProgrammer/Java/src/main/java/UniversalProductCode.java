public final class UniversalProductCode {
    public static int upc(String code) {
        String paddedCode = String.format("%1$11s", code).replace(' ', '0');

        int evenIndexSum = 0;
        int oddIndexSum = 0;
        for (int i = 0; i < paddedCode.length(); i++) {
            int digit = Character.getNumericValue(paddedCode.charAt(i));
            if (i % 2 == 0) {
                evenIndexSum += digit;
            } else {
                oddIndexSum += digit;
            }
        }

        int m = ((evenIndexSum * 3) + oddIndexSum) % 10;
        return m != 0 ? 10 - m : m;
    }

    public static int upc(long code) {
        return upc(String.valueOf(code));
    }

    public static boolean validate(String code) {
        if (code.length() != 12) {
            return false;
        }

        return upc(code.substring(0, 11)) == Character.getNumericValue(code.charAt(11));
    }
}
