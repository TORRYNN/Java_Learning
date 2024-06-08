import java.util.Random;

public class TwoDArray {
    public static void main(String[] args) {
        // Creation of 2D Array
        int matrix[][] = new int[3][3];

        // To calculate the number of rows=
        int row = matrix.length;

        // To calculate the number of Column
        int column = matrix[0].length;

        Random random = new Random();
        // Inserting Values into the 2D array.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                // The range of random number is from 0-10 where 10 is exclusive
                matrix[i][j] = random.nextInt(10);
            }
        }

        // Printing the 2D Array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Searching in 2D array;
        int key = 5;
        boolean found=false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(matrix[i][j]==key) {
                    System.out.println("key="+key);
                    System.out.println("Found at cell"+"["+i + ","+j+"]");
                    found=true;
                }
            }
            
        }
        if(!found){
            System.out.println(-1);
        }

    }

}
