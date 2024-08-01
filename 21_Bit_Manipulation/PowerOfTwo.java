public class PowerOfTwo {
    public static boolean isPowerOfTwo(int num) {
        if ((num & (num - 1)) == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(9));

    }

}
