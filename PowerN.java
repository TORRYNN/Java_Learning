public class PowerN {
    static int getPower(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        return num * getPower(num, pow - 1);
    }
    // T.C (logn)
    static int OptimisedgetPower(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        int halfpower = OptimisedgetPower(num, pow / 2);
        int power = halfpower * halfpower;

        if (pow % 2 != 0) {
            power = num * power;
        }

        return power;
    }

    public static void main(String[] args) {
        System.out.println(getPower(2, 4));
        System.out.println(OptimisedgetPower(2, 5));
    }
}
