import java.util.HashSet;

public class Question1 {
    public static boolean Distinct(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    // Time Comlexity=O(n2) Space Complexity=O(1);

    // Using HashSet

    public static boolean distinct(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hs.contains(arr[i])) {
                return true;
            } else {
                hs.add(arr[i]);
            }
        }
        return false;
    }
    // Time Comlexity=O(n)                  Space Complexity=O(n);

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1 };
        System.out.println(Distinct(arr));
        System.out.println(distinct(arr));
    }

}
