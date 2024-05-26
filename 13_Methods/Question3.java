// Wap to check if a number is palindrome or not.

public class Question3 {
    public static boolean isPalindrome(int num) {
        int rev = 0;
        int originalnum = num;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return (originalnum == rev);

    }

    public static boolean isPalindrome(String str) {
        int strlen = str.length();
        String rev = "";
        for (int i = (strlen - 1); i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return (str.toLowerCase().equals(rev.toLowerCase()));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome("ababaa"));

    }

}
