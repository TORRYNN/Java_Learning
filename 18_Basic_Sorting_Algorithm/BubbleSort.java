import java.util.*;

public class BubbleSort {
    public static int[] bsort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
        // Time Comlexity=O(n2) Space Comlexity=O(1)
    }

    // This is not a bubble sort sorting
    public static ArrayList<Integer> bsort(ArrayList<Integer> arr) {
        Collections.sort(arr);
        return arr;
        // Time Comlexity=O(1) Space Comlexity=O(1)

    }

    public static void main(String[] args) {
        int ar[] = { 5, 4, 1, 3, 2 };
        for (int num : ar) {
            System.out.print(num + " ");
        }
        System.out.println();
        bsort(ar);
        for (int num : ar) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(99, 23, 1, 53, 22, 53));
        for (int num : arr) {
            System.out.print(num + " ");
        }
        bsort(arr);
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
