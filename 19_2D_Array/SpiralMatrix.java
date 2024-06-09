public class SpiralMatrix {
    public static void printSpiral(int mat[][]) {
        int row = mat.length;
        int col = mat[0].length;

        int startrow = 0;
        int startcol = 0;
        int endrow = row - 1;
        int endcol = col - 1;

        // OuterLoop
        while (startrow <= endrow && startcol <= endcol) {
            // top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(mat[startrow][j] + " ");
            }

            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(mat[i][endcol] + " ");
            }

            // Bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(mat[endrow][j] + " ");
            }

            // Left
            for (int i = endrow - 1; i > startrow; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(mat[i][startcol] + " ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        // Time Complexity: O(m*n): where m is number of rows and n is number of
        // columns.
        // Space Complexity:O(1)
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 } };

        printSpiral(matrix);
    }

}
