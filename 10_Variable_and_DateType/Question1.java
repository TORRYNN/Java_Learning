

//In a  program , input 3 numbers :A ,B and C. You have to out put the average of these 3 numbers.

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a + b + c) / 3;
        System.out.println("Average of 3 num " + avg);
        sc.close();

    }
}
