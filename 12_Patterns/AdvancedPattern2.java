
public class AdvancedPattern2 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("---------------------------- Pattern1 ----------------------------");

        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *

        String pattern[] = new String[2 * n - 1];
        for (int i = 1; i < 2 * n; i++) {
            StringBuilder row = new StringBuilder();
            int breakpoint = i;
            if (i > n)
                breakpoint = 2 * n - i;
            for (int j = 1; j < breakpoint; j++) {
                row.append(" ");
            }
            for (int j = 0; j < breakpoint; j++) {
                row.append("*");
            }
            pattern[i - 1] = row.toString();

        }
        for (String row : pattern) {
            System.out.println(row);
        }
        System.out.println("---------------------------- Pattern2 ----------------------------");
        // 1 2 3 4 5
        // 2 3 4 5
        // 3 4 5
        // 4 5
        // 5
        // 4 5
        // 3 4 5
        // 2 3 4 5
        // 1 2 3 4 5
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {

            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = n - i; j <= n; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }

        for (int i = 0; i < 2 * n; i++) {
            int num = i;
            int breakpoint = i;
            if (i > n)
                breakpoint = 2 * n - i;
            for (int j = 1; j < breakpoint; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= breakpoint; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }

    }

}
