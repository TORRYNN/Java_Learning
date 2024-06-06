
public class CountingSort {
    // This only works for postive values;
    public static void Csort(int arr[]) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        
        

        // Sorting
        int j = 0;
        for (int i = 0; i <=largest; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
// Time Complexity:
// Finding the largest element: O(n)
// Populating the count array: O(n)
// Reconstructing the sorted array: O(n+k), where k is the largest element.
// Overall: O(n+k)

// Space Complexity:
// The count array: O(k)
// Overall: O(k)

    public static void main(String[] args) {
        int ar[] = { 5, 4, 1, 3, 2 };
        for (int num : ar) {
            System.out.print(num + " ");
        }
        System.out.println();
        Csort(ar);
        for (int num : ar) {
            System.out.print(num + " ");
        }
    }

}
