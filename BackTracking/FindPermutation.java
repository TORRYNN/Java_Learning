public class FindPermutation {
    public static void Perm(String str, String ans) {
        // Base Case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);
            // Deleting the current character from the string
            String newStr = str.substring(0, i) + str.substring(i + 1);
            Perm(newStr, ans + current);
        }
    }

    public static void main(String args[]) {
        Perm("abc", "");

    }
}
