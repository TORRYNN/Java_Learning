public class PracticeQs2 {
    final static char[][] Keypad = {
            {},
            {},
            { 'a', 'b', 'c' },
            { 'd', 'e', 'f' },
            { 'g', 'h', 'i' },
            { 'j', 'k', 'l' },
            { 'm', 'n', 'o' },
            { 'p', 'q', 'r', 's' },
            { 't', 'u', 'v' },
            { 'w', 'x', 'y', 'z' }
    };

    public static void letterCombinations(String str) {
        int len = str.length();
        // If the string is empty print nothing
        if (len == 0) {
            System.out.println("");

            return;

        }
        bfs(0, len, new StringBuilder(), str);

    }

    public static void bfs(int pos, int len, StringBuilder output, String input) {
        // Base Condition
        if (pos == len) {
            System.out.println(output);
        } else {
            char[] letters = Keypad[Character.getNumericValue(input.charAt(pos))];
            // loop from 0 character to last character
            for (int i = 0; i < letters.length; i++) {
                bfs(pos + 1, len, new StringBuilder(output).append(letters[i]), input);
            }
        }

    }

    public static void main(String[] args) {
        letterCombinations("22");
    }
}
