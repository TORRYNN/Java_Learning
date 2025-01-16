public class PracticeQs1 {
    // Function to print solution
    public static void printSolution(int sol[][]) {
        for (int row[] : sol) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static boolean mazesolver(int maze[][]) {
        // store the size of maze 
        int N = maze.length;
        // Create a maze for solution
        int sol[][] = new int[N][N];
        // it checks if solution exist or not
        if (!solveMazeutil(maze, 0, 0, sol)) {
            System.out.println("Solution doesn't exist");
            return false;
        }
        printSolution(sol);
        return true;
    }

    // Maze Solver function
    public static boolean solveMazeutil(int maze[][], int x, int y, int sol[][]) {
        // Base Condition
        if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }
        // Checking if the cell is safe or not
        if (isSafe(maze, x, y)) {
            // if the cell is already part of the solution,
            if (sol[x][y] == 1) {
                return false;
            }

            sol[x][y] = 1;

            // Move left
            if (solveMazeutil(maze, x + 1, y, sol)) {
                return true;
            }

            // Move down
            if (solveMazeutil(maze, x, y + 1, sol)) {
                return true;
            }

            sol[x][y] = 0;
            return false;

        }
        return false;

    }

    public static boolean isSafe(int maze[][], int x, int y) {

        // Check if (x,y) is inside the maze and is a valid path
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);

    }

    public static void main(String args[]) {
        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };

        mazesolver(maze);
    }
}
