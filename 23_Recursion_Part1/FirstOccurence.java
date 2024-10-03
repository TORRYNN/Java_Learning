public class FirstOccurence {
    public static int isFirstOccurence(int arr[], int key, int i) {
        if (i == arr.length)
            return -1;
        if (arr[i] == key)
            return i;

        return isFirstOccurence(arr, key, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(isFirstOccurence(arr, 4, 0));
    }

}
