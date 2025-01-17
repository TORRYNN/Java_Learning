import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiDArrayList {
    public static void main(String[] args) {
        List<List<Integer>> mainlist = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(3, 6, 9, 12, 15));
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        // Print the list
        System.out.println(mainlist);
        System.out.println("----------------------------------------------------------------");
        // Printing the element of list
        for (int i = 0; i < mainlist.size(); i++) {
            List<Integer> list = mainlist.get(i);
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + " ");
            }
            System.out.println();
        }
    }
}
