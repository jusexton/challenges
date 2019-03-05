public final class DescendingOrder {
    // public static int sortDesc(final int num) {
    //     return Integer.parseInt(String.valueOf(num).chars()
    //             .mapToObj(Character::toString)
    //             .sorted(Comparator.reverseOrder())
    //             .collect(Collectors.joining("")));
    // }

    public static int sortDesc(final int num) {
        String reversedNumber = new StringBuilder(String.valueOf(num)).reverse().toString();
        return Integer.parseInt(reversedNumber);
    }
}