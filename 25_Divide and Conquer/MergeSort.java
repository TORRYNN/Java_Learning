public class MergeSort {
    public static void mergeSort(int arr[], int lowerbound, int upperbound) {
        // Base Condition
        if (lowerbound >= upperbound)
            return;
        int mid = lowerbound + (upperbound - lowerbound) / 2;

        mergeSort(arr, lowerbound, mid);
        mergeSort(arr, mid + 1, upperbound);
        merge(arr, lowerbound, mid, upperbound);
    }

    public static void merge(int arr[], int lowerbound, int mid, int upperbound) {
        // Creating a temporary array
        int temp[] = new int[upperbound - lowerbound + 1];
        // Iterator for left part;
        int i = lowerbound;
        // Iterator for right part;
        int j = mid + 1;
        // Iterator for temp array;
        int k = 0;

        while (i <= mid && j <= upperbound) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        
        // Copying the remaining element of the left half if any

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copying the remaining element of the right half ,if any
        while (j <= upperbound) {
            temp[k++] = arr[j++];
        }
        // Copying temporary Array to Original Array
        for (k = 0, i = lowerbound; k < temp.length; k++, i++) {
            arr[i] = temp[k];

        }

    }
    // Time Complexity: O(nlogn);
    // Space Complexity: O(n)
    public static void printArr(int arr[]) {
        for (int num : arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        System.out.println("Array before sorting");
        printArr(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Array after sorting");
        printArr(arr);

    }
}
