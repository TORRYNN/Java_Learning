// InversionCount
public class PracticeQs3 {
    // Brute Force Approach
    // Time Complexity: O(n^2)
    public static int InversionCount(int arr[], int low, int high) {
        int count = 0;
        for (int i = 0; i < high; i++) {
            for (int j = i + 1; j < high; j++) {
                if (arr[i] > arr[j] && i < j) {
                    count++;
                }
            }
        }
        return count;

    }
    // Using Divide and Conqueror Technique
    // Time Complexity:O(nlogn)
    // Modified MergeSort
    public static int MergeSort(int arr[], int low, int high) {

        int InversionCount = 0;
        if (low >= high) {
            return 0;
        }

        int mid = low + (high - low) / 2;
        InversionCount = MergeSort(arr, low, mid);
        InversionCount += MergeSort(arr, mid + 1, high);
        InversionCount += Merge(arr, low, mid, high);

        return InversionCount;
    }

    private static int Merge(int arr[], int low, int mid, int high) {
        int temp[] = new int[high - low + 1];
        int InversionCount = 0;
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                InversionCount += (mid - i+1);
                j++;
            }
            k++;

        }
        // if there is some remaining element in left part or high part
        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }
        while (j <= high) {
            temp[k] = arr[j];
            k++;
            j++;
        }
        for (i = low, k = 0; i <= high; i++, k++) {
            arr[i] = temp[k];
        }

        return InversionCount;

    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 1, 3, 5 };
        System.out.println(InversionCount(nums, 0, nums.length - 1));
        System.out.println(MergeSort(nums, 0, nums.length - 1));
    }
}
