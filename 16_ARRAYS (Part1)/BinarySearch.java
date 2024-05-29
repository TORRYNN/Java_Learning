public class BinarySearch {
    public static int search(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        int arr[] = { 1, 3, 4, 56, 78, 444, 565, 999 };
        int key = 99;
        System.out.println("Index of " + key + " is at: " + search(arr, key));
    }

}
