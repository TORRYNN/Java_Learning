public class LastOccurence {
    static int lastOccurence(int arr[], int key, int i) {
        // Base Condition
        if (i == arr.length) {
            return -1;
        }
        int index = lastOccurence(arr, key, i + 1);
        if (index != -1) {
            return index;
        }

        if (arr[i] == key) {
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 6, 1, 3, 6 };
        int key = 6;
        int lastIndex = lastOccurence(arr, key, 0);
        System.out.println("Last occurrence of " + key + " is at index: " + lastIndex);
    }
}
