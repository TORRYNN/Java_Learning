import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Question5 {
    public static ArrayList<ArrayList<Integer>> findTriplets(ArrayList<Integer> arr) {
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    if (arr.get(i) + arr.get(j) + arr.get(k) == 0) {
                        ArrayList<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(arr.get(i));
                        triplet.add(arr.get(j));
                        triplet.add(arr.get(k));
                        Collections.sort(triplet);
                        set.add(triplet);
                    }

                }
            }
        }
        return new ArrayList<>(set);
    }
    // Time Complexity=O(n3)       Space Complexity=O(n3)     
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(-1, 0, 1, 2, -1, -4));

        System.out.println(findTriplets(num));
    }

}
