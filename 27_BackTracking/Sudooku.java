public class Sudooku {
    public static boolean issafe(int sudoku[][], int row, int col, int digit) {
        // Condition for column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // Condition for row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // Condition for grid
        int startrow = (row / 3) * 3;
        int startcol = (col / 3) * 3;
        for (int i = startrow; i < startrow + 3; i++) {
            for (int j = startcol; j < startcol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokusolver(int sudoku[][], int row, int col) {
        // Base Case
        if (row == 9) {
            return true;
        }

        // recursion
        int nextrow = row, nextcol = col + 1;
        if (col + 1 == 9) {
            nextrow = row + 1;
            nextcol = 0;

        }

        // if cell is already filled, skip it
        if (sudoku[row][col] != 0) {
            return sudokusolver(sudoku, nextrow, nextcol);
        }

        // Try placing digits 1-9
        for (int digit = 1; digit <= 9; digit++) {
            if (issafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokusolver(sudoku, nextrow, nextcol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] sudokuGrid = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };
        if (sudokusolver(sudokuGrid, 0, 0)) {
            System.out.println("Solution exist");
        }
    }

}
