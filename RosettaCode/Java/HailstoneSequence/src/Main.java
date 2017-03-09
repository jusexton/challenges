import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Inspired by rosettacode.org
 * http://rosettacode.org/wiki/Hailstone_sequence
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(getHailstoneSequence(27).getSequence().stream()
                .map(String::valueOf).collect(Collectors.joining(", ")));

        HailStoneSequence largestSequence = getLargestHailstoneSequenceInRange(1, 100000);
        String largestSequenceData = String.format("Value: %d, Size: %d",
                largestSequence.getValue(),
                largestSequence.getSequence().size());
        System.out.println(largestSequenceData);
    }

    private static HailStoneSequence getHailstoneSequence(int value) {
        if (value <= 0) throw new IllegalArgumentException("Invalid starting sequence number");

        HailStoneSequence hailstoneSequence = new HailStoneSequence();
        hailstoneSequence.setValue(value);
        hailstoneSequence.getSequence().add(value);
        while (value != 1) {
            if (value % 2 == 0) {
                value /= 2;
            } else {
                value = (3 * value) + 1;
            }
            hailstoneSequence.getSequence().add(value);
        }
        return hailstoneSequence;
    }

    private static HailStoneSequence getLargestHailstoneSequenceInRange(final int min, final int max) {
        HailStoneSequence largestHailstoneSequence = getHailstoneSequence(min);
        for (int i = min + 1; i <= max; i++) {
            HailStoneSequence possibleLargest = getHailstoneSequence(i);
            if (possibleLargest.getSequence().size() > largestHailstoneSequence.getSequence().size()) {
                largestHailstoneSequence = possibleLargest;
            }
        }
        return largestHailstoneSequence;
    }

    // Represents a Hailstone Sequence.
    // Stores the a sequence and the value used to achieve the stored sequence.
    private static class HailStoneSequence {
        private int value;
        private ArrayList<Integer> sequence;

        public HailStoneSequence() {
            sequence = new ArrayList<>();
        }

        public HailStoneSequence(int value, ArrayList<Integer> sequence) {
            this.value = value;
            this.sequence = sequence;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public ArrayList<Integer> getSequence() {
            return sequence;
        }

        public void setSequence(ArrayList<Integer> sequence) {
            this.sequence = sequence;
        }
    }
}
