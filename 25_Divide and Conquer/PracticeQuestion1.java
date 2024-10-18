// MergeSort
public class PracticeQuestion1 {
    public static void PrintArray(String arr[]) {
        for (String elemnt : arr) {
            System.out.print(elemnt + " ");
        }
    }

    public static void MergeSort(String arr[], int start, int end) {
        if (start >= end)
            return;

        int mid = start + (end - start) / 2;
        MergeSort(arr, start, mid);
        MergeSort(arr, mid + 1, end);
        Merge(arr, start, mid, end);

    }

    public static void Merge(String arr[], int start, int mid, int end) {

        String temp[] = new String[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i].charAt(0) < arr[j].charAt(0)) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];

        }
        while (j <= end) {
            temp[k++] = arr[j++];

        }
        for (k = 0, i = start; k < temp.length; k++, i++) {
            arr[i] = temp[k];

        }
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury", "a", "c" };
        System.out.println("Array before sorting");
        PrintArray(arr);
        MergeSort(arr, 0, arr.length - 1);
        System.out.println();
        System.out.println("Array after sorting");
        PrintArray(arr);
    }
}
