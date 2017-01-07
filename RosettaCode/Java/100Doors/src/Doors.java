import java.util.BitSet;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * Inspired by RosettaCode.org
 * http://rosettacode.org/wiki/100_doors
 */
public class Doors {
    private static final BitSet doors = new BitSet(100);

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .forEach(x -> flipDoors(i -> i % x == 0));

        System.out.println(doors.toString());
        System.out.printf("Doors Open: %1s%n", doors.cardinality());
    }

    public static void flipDoors(final Predicate<Integer> predicate) {
        IntStream.rangeClosed(1, 100)
                .boxed()
                .filter(predicate)
                .forEach(doors::flip);
    }
}
