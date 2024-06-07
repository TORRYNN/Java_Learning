
public class Quesiton {

    public static void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionsort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;

        }
    }

    public static void insertionsort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] < arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;

            }
        }
    }

    public static void countingsort(int arr[]) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = largest; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print(int arr[]) {

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int ar[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        System.out.println("-------------------Bubble  Sort in reverse-------------------");
        print(ar);
        bubblesort(ar);
        print(ar);
        ar = new int[] { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        System.out.println("-------------------Selection  Sort in reverse-------------------");
        print(ar);
        selectionsort(ar);
        print(ar);
        ar = new int[] { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        System.out.println("-------------------Insertion  Sort in reverse-------------------");
        print(ar);
        insertionsort(ar);
        print(ar);
        ar = new int[] { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        System.out.println("-------------------Counting  Sort in reverse-------------------");
        print(ar);
        countingsort(ar);
        print(ar);
    }
}
