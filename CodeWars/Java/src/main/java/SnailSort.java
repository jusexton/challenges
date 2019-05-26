import java.util.ArrayList;
import java.util.List;

public final class SnailSort {
    /**
     * Accepts a two dimensional array of numbers and returns the snail sorted single array result.
     * <p>
     * Ex.
     * <p>
     * [
     * [1, 6],
     * [5, 2]
     * ]
     * <p>
     * yields
     * <p>
     * [1, 6, 2, 5]
     * <p>
     * Ex.
     * [
     * [5, 8, 2, 5],
     * [5, 8, 2, 5]
     * [3, 5, 1, 3],
     * [9, 6, 2, 6]
     * ]
     * <p>
     * yields
     * <p>
     * [5, 8, 2, 5, 5, 3, 6, 2, 6, 9, 3, 5, 8, 2, 1, 5]
     *
     * @param numbers The two dimensional array to snail sort.
     * @return The result of snail sort.
     */
    public static int[] sort(final int[][] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Given numbers cannot be null");
        }

        // If number in array do not form a square shape, the snail sort is drastically simplified.
        final int size = numbers.length;
        if (size == 0) {
            return new int[]{};
        } else if (size == 1) {
            return numbers[0];
        }

        final int squareSize = size * size;
        final List<Integer> result = new ArrayList<>(squareSize);
        // 0 Index - top limitation
        // 1 Index - right limitation
        // 2 Index - bottom limitation
        // 3 Index - left limitation
        // Used to track the location of cursor.
        // Also resembles how many 'revolutions' have been made in each direction.
        final int[] limiters = {0, 0, 0, 0};

        int row = 0;
        int col = 0;
        while (result.size() < squareSize) {
            // Traversing to the right
            while (col < size - limiters[1] - 1) {
                result.add(numbers[row][col]);
                col++;
            }
            result.add(numbers[row++][col]);
            limiters[0] = ++limiters[0];

            // Traversing down
            while (row < size - limiters[2] - 1) {
                result.add(numbers[row][col]);
                row++;
            }
            result.add(numbers[row][col--]);
            limiters[1] = ++limiters[1];

            //Traversing left
            while (col > limiters[3]) {
                result.add(numbers[row][col]);
                col--;
            }
            result.add(numbers[row--][col]);
            limiters[2] = ++limiters[2];

            // Traversing up
            while (row >= limiters[0]) {
                result.add(numbers[row][col]);
                row--;
            }
            limiters[3] = ++limiters[3];

            if (result.size() + 1 == squareSize) {
                result.add(numbers[++row][++col]);
            } else {
                row++;
                col++;
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
