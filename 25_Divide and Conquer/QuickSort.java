public class QuickSort {
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int loc = partition(arr, low, high);
            quickSort(arr, low, loc - 1);
            quickSort(arr, loc + 1, high);

        }
    }

    static int partition(int arr[], int low, int high) {

        int pivot = arr[low];
        int start = low;
        int end = high;

        while (start < end) {

            while (arr[start] <= pivot && start < high) {
                start++;

            }

            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }

        }
        int temp = arr[low];
        arr[low] = arr[end];
        arr[end] = temp;

        return end;

    }

    public static void printArr(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
        System.out.println("Array before sorting");
        printArr(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array after sorting");
        printArr(arr);
    }
}
