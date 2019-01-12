import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SudokuSolutionValidatorTests {
    private final int[][] SUDOKU_BOARD = {
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
    };

    @Test
    @DisplayName("Should return true if given a valid and correctly solved sudoku board")
    public void testTheCorrectlySolvedSudokuSolutions() {
        assertTrue(SudokuSolutionValidator.check(SUDOKU_BOARD));
    }

    @Test
    @DisplayName("Should return false if given an invalid or incorrectly solved sudoku board")
    public void testTheIncorrectlySolvedSudokuSolutions() {
        // Make copy so we can mutate the original passing board without messing with its state.
        final int[][] testBoard = new int[9][9];
        System.arraycopy(SUDOKU_BOARD, 0, testBoard, 0, SUDOKU_BOARD.length);

        testBoard[0][0]++;
        testBoard[1][1]++;
        testBoard[0][1]--;
        testBoard[1][0]--;

        assertFalse(SudokuSolutionValidator.check(testBoard));

        testBoard[0][0]--;
        testBoard[1][1]--;
        testBoard[0][1]++;
        testBoard[1][0]++;

        testBoard[4][4] = 0;

        assertFalse(SudokuSolutionValidator.check(testBoard));
    }
}
