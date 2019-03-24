public final class MatrixAddition {
    public static int[][] add(int[][] m1, int[][] m2) {
        int[][] summation = new int[m1.length][m1[0].length];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                summation[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return summation;
    }
}
