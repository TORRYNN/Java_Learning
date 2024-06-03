
// Write a method named isEven that accepts an int argument. The method should return true if the argument is even , or false otherwise.Also write a program to test your method.

public class Question2 {
    public static boolean isEven(int a) {

        return ((a % 2) == 0);
    }

    public static void main(String[] args) {
        System.out.println(isEven(5) + " is a even number");

        System.out.println(isEven(10) + " is a odd number");

    }

}
