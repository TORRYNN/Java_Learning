public class QuickSortBetter {
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);

        }
    }

    static int partition(int arr[], int low, int high) {
        // Choose last element as pivot element
        int pivot = arr[high];
        // Index of the smaller element
        int i = low - 1;

        // traverse throught the array and rearrange based on the pivot
        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        // Placing the pivot element at its correct position
        // By swapping the pivot element with the element at i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;

    }

    public static void printArr(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
        System.out.println("Array before sorting");
        printArr(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array after sorting");
        printArr(arr);
    }
}
