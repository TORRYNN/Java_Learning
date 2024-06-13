public class Question {
    public static int Count(int[][] arr, int key) {
        int count = 0;

        // Loop through each row
        for (int[] row : arr) {
            // Loop through each element in the row
            for (int element : row) {
                // If the element matches the key, increment the count
                if (element == key) {
                    count++;
                }
            }
        }

        return count;
    }
    // Print out the sum of the numbers in the second row of the "nums" array;
    public static  int sum(int mat[][]){
        int sum=0;
        for(int i=0; i<mat.length; i++){
            sum+=mat[1][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };
        System.out.println(Count(array, 7)); // Output should be 2

        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        System.out.println("Sum "+sum(nums));
    }
}
