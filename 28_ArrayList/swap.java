import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class swap {
    public static void Swap(List<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 9, 3, 6));
        int idx1 = 1, idx2 = 4;
        System.out.println("Before Swap");
        System.out.println(list);
        Swap(list, idx1, idx2);
        System.out.println("After Swap");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After Sorting");
        System.out.println(list);
    }
}