// Write a Java program that takes a year from the user and print whether that year is a leap year or not.

import java.util.*;

public class Question5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();

        if(year%4==0){
            if(year%100==0){     
                if(year%400==0){
                    System.out.println("leap year");
                }
                else{
                    System.out.println("Not a leap year");
                }
            }
        }
    }
}
