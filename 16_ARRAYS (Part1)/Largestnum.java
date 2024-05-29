
public class Largestnum {
    public static int largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i : arr) {
            largest = Math.max(largest, i);
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 33, 44, 23, 54, 212, 1, 3003, -5469 };
        System.out.println(largest(arr));
    }
}
