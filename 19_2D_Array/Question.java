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

    public static void main(String[] args) {
        int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };
        System.out.println(Count(array, 7)); // Output should be 2
    }
}
