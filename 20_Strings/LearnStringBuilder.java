
public class LearnStringBuilder {
    // For a given String convert the first letter of each word to Uppercase.
    public static String capitalise(String str) {
        StringBuilder sb = new StringBuilder("");
        // Does not cover all edge cases.
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }

    public static String capitalise1(String str) {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                sb.append(ch);
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    sb.append(Character.toUpperCase(ch));
                    capitalizeNext = false;
                } else {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();

        // Time complexity: O(n) where n is the length of the input string.
        // Space complexity: O(n) for the StringBuilder.
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);

        String str = " hello there i am pratham chauhan a";
        System.out.println(capitalise(str));
        String str1 = " hello there i am pratham chauhan a";
        System.out.println(capitalise1(str1));
        String str2 = "hello there i am pratham chauhan a";
        System.out.println(capitalise1(str2));
    }

}
