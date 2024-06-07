
public class SelectionSort {
    public static int[] Ssort(int arr[]) {
        // Idea: pick the smallest( from unsorted) ,put it at the beginning of the
        // array.
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        return arr;

        // Time Complexity=O(n2)                    Space Comlexity=O()
    }

    public static void main(String[] args) {
        int ar[] = { 5, 4, 1, 3, 2 };
        for (int num : ar) {
            System.out.print(num + " ");
        }
        System.out.println();
        Ssort(ar);
        for (int num : ar) {
            System.out.print(num + " ");
        }
    }
}
