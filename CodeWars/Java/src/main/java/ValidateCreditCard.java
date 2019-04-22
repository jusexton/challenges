import java.util.stream.IntStream;

public final class ValidateCreditCard {
    public static boolean validate(final String cardNumber) {
        if (cardNumber.isEmpty() || cardNumber.length() > 16) {
            return false;
        }

        final int length = cardNumber.length();
        final int decider = length % 2 == 0 ? 0 : 1;
        final int sum = IntStream.range(0, cardNumber.length())
                .map(i -> {
                    final int number = Character.getNumericValue(cardNumber.charAt(i));
                    final int anotherNumber = i % 2 == decider ? number * 2 : number;
                    return anotherNumber > 9 ? anotherNumber - 9 : anotherNumber;
                })
                .sum();

        return sum % 10 == 0;
    }
}
