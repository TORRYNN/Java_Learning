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
        System.out.println("---------------------------- Pattern4 ----------------------------");
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

    }
}
