
public class InsertionSort {
    public static int[] Isort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        return arr;
        // Time Complexity: BestCase=O(n) Average/Worst Case=O(n2)
        // Space Complexity: O(1)
    }

    public static void main(String[] args) {
        int ar[] = { 5, 4, 1, 3, 2 };
        for (int num : ar) {
            System.out.print(num + " ");
        }
        System.out.println();
        Isort(ar);
        for (int num : ar) {
            System.out.print(num + " ");
        }
    }

}
