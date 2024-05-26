// Write a Java Method to compute the average of three numbers;

import java.util.Scanner;

public class Question1 {
    public static int avg(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        System.out.println(avg(2, 3, 4));
        System.out.println(avg(5, 3, 4));

    }
}
