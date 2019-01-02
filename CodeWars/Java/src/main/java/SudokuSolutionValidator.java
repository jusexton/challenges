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

    private static boolean validate(int[] group) {
        return Arrays.stream(group).distinct().filter(i -> i > 0 && i < 10).count() == 9;
    }
}
