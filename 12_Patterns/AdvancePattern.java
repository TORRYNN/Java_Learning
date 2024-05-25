import java.util.Scanner;

public class AdvancePattern {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("---------------------------- Pattern1 ----------------------------");
        // 1
        // 11
        // 121
        // 1221
        // 12221
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print(1);
                } else {
                    System.out.print(2);
                }

            }
            System.out.println();
        }

        System.out.println("---------------------------- Pattern2 ----------------------------");
        // 1
        // 232
        // 34543
        // 4567654
        // 567898765
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            int num = i + 1;
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(num);
                if (j <= breakpoint)
                    num++;
                else
                    num--;
            }
            System.out.println();
        }
        System.out.println("---------------------------- Pattern3 ----------------------------");
        // 1
        // 23
        // 345
        // 4567
        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }

        System.out.println("---------------------------- Pattern4 ----------------------------");
        // *
        // ***
        // *****
        // *******
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------- Pattern5 ----------------------------");
        // 1
        // 23
        // 345
        // 4567
        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }

        System.out.println("---------------------------- Pattern6 ----------------------------");
        // 1
        // 23
        // 345
        // 4567
        String pattern[] = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            int num = i + 1;
            for (int j = 0; j <= i; j++) {
                row.append(num);
                num++;
            }
            pattern[i] = row.toString();
        }
        for (String row : pattern) {
            System.out.println(row);
        }
        System.out.println("---------------------------- Pattern7 ----------------------------");
        // 1 2 3 4 5
        // 2 3 4 5
        // 3 4 5
        // 4 5
        // 5
        // 4 5
        // 3 4 5
        // 2 3 4 5
        // 1 2 3 4 5
        for (int i = 0; i < n; i++) {
            int num = i + 1;

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();

        }

        for (int i = 1; i <= n - 1; i++) {
            int num = n - i;
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();

        }
        System.out.println("---------------------------- Pattern9 ----------------------------");
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------- Pattern10 ----------------------------");
        // 1
        // 2
        // 3
        // 4
        // 5
        // 4
        // 3
        // 2
        // 1
        for (int i = 1; i < 2 * n; i++) {
            int count = i;
            if (i > n)
                count = 2 * n - i;
            for (int j = 0; j < count - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.print(count);
                }
            }
            System.out.println();
        }
    }
}
