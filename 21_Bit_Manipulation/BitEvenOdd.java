public class BitEvenOdd {
    public static void evenodd(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println(n + " is an Even Number ");

        } else {
            System.out.println(n + " is an Odd Number");
        }
    }

    public static void main(String[] args) {
        evenodd(8);
        evenodd(9);
    }
}
