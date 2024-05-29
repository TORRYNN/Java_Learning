// WAP for linear Search in array.

public class LinearSearch {
    public static final int lSearch(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (key.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int lSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 11, 2 };
        String fruit[] = { "apple", "banana", "grapes", "orange", "strawberry" };
        int key = 5;
        System.out.println(lSearch(arr, 13));
        System.out.println(lSearch(arr, 3));
        int index = lSearch(arr, key);
        index = lSearch(fruit, "strawberry");
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Element is at index " + index);
        }
    }
}
