import java.util.Arrays;

public final class SudokuSolutionValidator {
    public static boolean check(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            int[] row = grid[i].clone();
            int[] column = new int[9];
            int[] square = new int[9];

            for (int j = 0; j < 9; j++) {
                column[j] = grid[j][i];
                square[j] = grid[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3];
            }

            if (!(validate(row) && validate(column) && validate(square))) {
                return false;
            }
        }

        return true;
    }

    /**
     * Validates a given sudoku group, whether the group is a vertical/horizontal line or sudoku square
     * it will be given and validated as a single array of numbers.
     *
     * @param group The sudoku group that will be validated
     * @return Whether the given group is valid or not
     */
    private static boolean validate(int[] group) {
        // If a group contains one of each number 1-9 it is a valid group
        return Arrays.stream(group)
                .distinct()
                .filter(i -> i > 0 && i < 10)
                .count() == 9;
    }

    // private static boolean validate(Integer[] group) {
    //     // If a group contains one of each number 1-9 it is a valid group
    //     Set<Integer> numbers = new HashSet<>(Arrays.asList(group));
    //     return numbers.size() == 9 && numbers.stream().mapToInt(i -> i).sum() == 45;
    // }
}
