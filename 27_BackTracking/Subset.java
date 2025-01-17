// abc
// a,b,c,bc,ac,abc

public class Subset {
    // Using Brute Force Approach
    public static void subset1(String str) {
        int n = str.length();
        int totalSubsets = (int) Math.pow(2, n);
        for (int i = 0; i < totalSubsets; i++) {
            StringBuilder subset = new StringBuilder();

            // Check each bit of the number to decide inclusion of characters
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.append(str.charAt(j));
                }
            }
            System.out.println(subset.toString());
        }

    }

    // Using BackTracking
    public static void subset2(String str, String ans, int i) {
        // Base Case

        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // Yes Choice
        subset2(str, ans + str.charAt(i), i + 1);

        // No Choice
        subset2(str, ans, i + 1);
    }

    // Backtracking using Stringbuilder
    public static void subset3(String str, StringBuilder ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        subset3(str, new StringBuilder(ans).append(str.charAt(i)), i + 1);

        subset3(str, ans, i + 1);
    }

    public static void main(String[] args) {
        subset1("abc");
        StringBuilder ans = new StringBuilder();
        subset3("abcd", ans, 0);
    }
}
