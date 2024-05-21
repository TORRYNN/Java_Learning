// Write a program to print the multiplicationtable of a number N,entered by the user.
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }

    }
    
}
