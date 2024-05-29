public class Reverse {
    public static int[] rev(int arr[]) {
        // T.C=O(n)
        // S.C=O(2)
        int n = arr.length;
        int rev[] = new int[n];
        for (int i = 0; i < n; i++) { //
            rev[n - i - 1] = arr[i];
        }
        return rev;
    }

    public static int[] betterrev(int arr[]) {
        // Better approach 
        //  T.C=O(n)
        // S.C=O(1)
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
        int rev[] = rev(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("--------------AFTER REVERSING THE ARRAY--------------");
        for (int num : rev) {
            System.out.print(num + " ");
        }
        int rev1[] = betterrev(arr);
        System.out.println();
        System.out.println("--------------AFTER REVERSING THE ARRAY--------------");
        for (int num : rev1) {
            System.out.print(num + " ");
        }
    }

}
