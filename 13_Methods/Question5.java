// WAP to compute the sum of the digits in an integer.

public class Question5 {
    public static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(811));
    }
}
