
public class PalindromeCheck {
    // BruteForce Approach
    public static boolean isPalindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev.toLowerCase().equals(str);

        // The time complexity of concatenating strings in this manner is O(n2) because
        // for each character appended, the entire current value of rev is copied.
        // T.C=0(n2) S.C=O(n)
    }

    // Two Pointer Technique
    public static boolean isPalindrome1(String str) {

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;

        // T.C=O(n) S.C=O(1)
    }
    // Recursion
    public static boolean isPalindrome2(String str, int start, int end) {
        if (start > end) {
            return true;
        }
        if (str.charAt(start) == str.charAt(end)) {
            return isPalindrome2(str, start + 1, end - 1);
        }

        return false;
        // Time Complexity: O(n)
        // Space Complexity: O(n) due to the call stack


    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("pratham"));
        System.out.println(isPalindrome("roor"));

        System.out.println(isPalindrome1("pratham"));
        System.out.println(isPalindrome1("roor"));

        String str = "pratham";
        String str1 = "opopo";

        System.out.println(isPalindrome2(str, 0, str.length() - 1));
        System.out.println(isPalindrome2(str1, 0, str1.length() - 1));
    }

}
