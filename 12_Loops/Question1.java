// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int esum=0;
        int osum=0;
        for (int i=0; i<=num; i++) {
            if(i%2==0){
                esum+=i;
            }
            else{
                osum+=i;
            }
        }
        System.out.println("Even sum "+esum);
        System.out.println("Odd sum "+osum);
        sc.close();
    }
    
}
