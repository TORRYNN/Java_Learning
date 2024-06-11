public class SearchinSortedMatrix {
    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static String binaryMatrixSearch(int mat[][], int key) {
        int index = 0;
        for (int i = 0; i < mat.length; i++) {
            index = binarySearch(mat[i], key);
            if (index != -1) {
                return "key found at index (" + i + "," + index + ")";
            }
        }

        return "Key not found";

        // Time Complexity:O(nlogn)

    }

    public static String Optimisedsearch(int mat[][], int key) {
        int row = 0, col = mat[0].length - 1;

        while (row < mat.length && col >= 0) {
            if (mat[row][col] == key) {
                
                return "key found at index (" + row + "," + col + ")";
                
            } else if (key < mat[row][col]) {
                col--;
            } else {
                row++;
            }

        }
        return "Key not found";
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 18, 12, 18, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        int key = 18;
        System.out.println(binaryMatrixSearch(matrix, key));
        System.out.println(Optimisedsearch(matrix, key));

    }
}
