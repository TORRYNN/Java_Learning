import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fac = 1;
        int num = sc.nextInt();
        if (num == 0 || num == 1) {
            fac = 1;
        } else {
            for (int i = 2; i <= num; i++) {
                fac *= i;
            }
        }
        System.out.println("Factorial of num " + num + " = " + fac);
        sc.close();
    }

}
