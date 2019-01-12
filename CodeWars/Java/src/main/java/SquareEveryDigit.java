import java.util.stream.Collectors;

public final class SquareEveryDigit {
    public int squareDigits(final int n) {
        return Integer.parseInt(String.valueOf(n).chars()
                .mapToObj(Character::getNumericValue)
                .map(i -> String.valueOf(i * i))
                .collect(Collectors.joining("")));
    }
}
