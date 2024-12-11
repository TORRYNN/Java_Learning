public class Nqueen {
    public static void nqueen(char board[][], int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {

                board[row][j] = 'Q';
                nqueen(board, row + 1);
                board[row][j] = 'X';
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {

        // Vertical Up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Diagonal left Up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char[][] board) {
        System.out.println("----------------");
        for (char row[] : board) {
            for (char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();

        }
    }

    // Time Complexity:O(n!)

    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        // Solve the N-Queens problem
        nqueen(board, 0);
    }
}
