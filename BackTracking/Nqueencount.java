public class Nqueencount {

    public static boolean nqueen(char board[][], int row) {
        // Base Condition
        if (row == board.length) {

            return true;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                if(nqueen(board, row + 1)){
                    return true;
                }
                
                board[row][col] = 'X';
            }
        }
        return false;
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

    public static void printboard(char[][] board) {
        System.out.println("----------------");
        for (char row[] : board) {
            for (char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        // Solve the N-Queens problem

        if (nqueen(board, 0)) {
            System.out.println("Solution is possible :");
            printboard(board);
        }
    }
}
