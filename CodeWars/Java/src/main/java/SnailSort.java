import java.util.ArrayList;
import java.util.List;

public final class SnailSort {
    public static int[] sort(int[][] numbers) {
        int size = numbers.length;
        if (size == 0) {
            return new int[]{};
        } else if (size == 1) {
            return numbers[0];
        }

        int squareSize = size * size;
        List<Integer> result = new ArrayList<>(squareSize);
        // 0 Index - top limitation
        // 1 Index - right limitation
        // 2 Index - bottom limitation
        // 3 Index - left limitation
        int[] limiters = {0, 0, 0, 0};

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
