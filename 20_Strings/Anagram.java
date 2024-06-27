import java.util.Arrays;
import java.util.HashMap;

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


    // Second Approach using 2 hashmap
    public static boolean areAnagram1(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        HashMap<Character, Integer> hmap1 = new HashMap<>();
        HashMap<Character, Integer> hmap2 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            if (hmap1.containsKey(c)) {
                hmap1.put(c, hmap1.get(c) + 1);
            } else {
                hmap1.put(c, 1);
            }
        }
        for (char c : str2.toCharArray()) {
            if (hmap2.containsKey(c)) {
                hmap2.put(c, hmap2.get(c) + 1);
            } else {
                hmap2.put(c, 1);
            }
        }

        return hmap1.equals(hmap2);

    }
    // Time Complexity: O(n )
    // Space Comlexity: O(k) where k is the number of distinct characters in the strings.


    // Approach 3 Using a single hashmap
    public static boolean areAnagram2(String str1, String str2){
        if(str1.length()==str2.length())
            return false;
        
        HashMap<Character,Integer> hashMap=new HashMap<>();
        // counting the character in hashmap 1
        for(char c:str1.toCharArray()){
            if(hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c)+1);
            }
            else{
                hashMap.put(c,1);
            }
        }
        for (char c : str2.toCharArray()) {
            // if hashmap not containing the character c
             if (!hashMap.containsKey(c)){
                return false;
            }
            hashMap.put(c, hashMap.get(c) -1);
            if(hashMap.get(c)==0){
                hashMap.remove(c);
            }
        }
        return hashMap.isEmpty();
        
    }

    // Time Complexity: O(n ) bcz it process each character in both the strings exactly once.
    // Space Comlexity: O(k) where k is the number of distinct characters in the
    // strings.

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

        String string1 = "listen";
        String string2 = "silent";

        if (areAnagram1(string1, string2))
            System.out.println(string1 + " and " + string2 + " are anagrams.");
        else
            System.out.println(string1 + " and " + string2 + " are not anagrams.");
    }
}
