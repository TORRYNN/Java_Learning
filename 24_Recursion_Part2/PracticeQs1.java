// For a given integer array of size N.You have to find all the occurrences (indices) of a given element(Key) and print them. Use a recursive function to solve this problem.
public class PracticeQs1 {
    static void occurrence(int arr[], int key, int i) {

        if (i == arr.length)
            return;

        if (arr[i] == key) {
            System.out.print(i + " ");

        }
        occurrence(arr, key, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        occurrence(arr, key, 0);

    }

}
