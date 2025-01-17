import java.util.ArrayList;
import java.util.Arrays;

public class Max {
    public static int max(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= max) {
                max = arr.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 5, 9, 3, 6, 9, 9, 9, 8, 999, 99, 101));

        System.out.println(max(arr));
    }
}
