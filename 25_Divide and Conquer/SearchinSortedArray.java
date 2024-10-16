public class SearchinSortedArray {
    public static int Search(int arr[], int target, int start, int end) {

        // Base Case
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        // if the target element is at the middle of the array
        if (target == arr[mid]) {
            return mid;
        }
        // If mid lie on line one
        if (arr[start] <= arr[mid]) {
            // Left Side: if target is greater then starting element but less than the
            // middle element
            if (arr[start] <= target && target <= arr[mid]) {
                return Search(arr, target, start, mid - 1);
            }
            // Right Side: if target is
            else {
                return Search(arr, target, mid + 1, end);
            }

        }
        // If mid lies on the line two
        else {
            // Right Side: if target is greater then starting element but less than the
            // middle element
            if (arr[mid] <= target && target <= arr[end]) {
                return Search(arr, target, start, mid - 1);
            }
            // left Side:
            else {
                return Search(arr, target, mid + 1, end);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 4;
        int index = Search(arr, target, 0, arr.length - 1);
        System.out.println(index);
    }

}
