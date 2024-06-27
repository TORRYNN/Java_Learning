import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Anagram {

    public static boolean areAnagram(char[] str1, char[] str2) {
        // Calculating the length of the string
        int n1 = str1.length;
        int n2 = str2.length;
        // If the length of the string is not equal then they cannot be anagram.
        if (n1 != n2) {
            return false;
        }

        // Sorting the String
        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++) {
            // If the char are not equal then they cannot be anagram
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;

    }
    // Time Complexity: O(N * logN), For sorting.
    // Space Comlexity: O(1) as it is using constant extra space

    /* Driver Code */
    public static void main(String args[]) {
        char str1[] = { 'g', 'r', 'a', 'm' };
        char str2[] = { 'a', 'r', 'm' };

        // Function Call
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }
}
