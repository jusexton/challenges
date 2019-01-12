public final class ExpandNumbers {
    // public static String expand(int number) {
    //     String digits = String.valueOf(number);
    //     String[] numbers = new String[digits.length()];
    //
    //     int place = 1;
    //     for (int i = digits.length() - 1; i >= 0; i--) {
    //         char digit = digits.charAt(i);
    //         numbers[i] = digit != '0' ? String.format("%-" + place + "s", digit).replace(' ', '0') : "";
    //         place++;
    //     }
    //
    //     return Arrays.stream(numbers).filter(s -> !s.equals("")).collect(Collectors.joining(" + "));
    // }

    public static String expand(int number) {
        String expanded = "";

        for (int i = 10; i < number; i *= 10) {
            int remainder = number % i;
            expanded = (remainder > 0) ? " + " + remainder + expanded : expanded;
            number -= remainder;
        }

        expanded = number + expanded;

        return expanded;
    }
}
