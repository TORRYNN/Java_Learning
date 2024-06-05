
public class BubbleSort {
    public static int[] bsort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                }
            }
        }
        return arr;

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

    }

}
