public class PairsArray {
    public static void PairsArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            for (int j = i; j < arr.length; j++) {
                System.out.print("(" + x + "," + arr[j] + ") ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 };
        PairsArray(arr);
    }

}
