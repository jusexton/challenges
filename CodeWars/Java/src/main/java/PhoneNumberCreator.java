import java.util.stream.IntStream;

public final class PhoneNumberCreator {
    // public static String createPhoneNumber(int[] numbers) {
    //     if (numbers.length != 10) {
    //         throw new IllegalArgumentException(
    //                 "Exactly 9 numbers must be given to create a phone number. " + numbers.length + " were given");
    //     }
    //
    //     String joinedNumbers = Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.joining(""));
    //     return String.format("(%s) %s-%s",
    //             joinedNumbers.substring(0, 3),
    //             joinedNumbers.substring(3, 6),
    //             joinedNumbers.substring(6, 10));
    // }

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
    }
}
