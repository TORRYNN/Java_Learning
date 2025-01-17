import java.util.ArrayList;
import java.util.Arrays;

public class IntroArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(10);
        arr.add(10);
        arr.set(1, 22);
        System.out.println(arr.indexOf(11));
        // size function is used to print the size of arraylist
        System.out.println(arr.size());

        // Print Reverse of an arrayList
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        for (int i = array.size() - 1; i >= 0; i--) {
            System.out.print(array.get(i) + " ");
            System.out.print(array. + " ");

        }
    }
}
