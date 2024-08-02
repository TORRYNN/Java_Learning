public class FastExponentiaiton {
    public static int fast(int num, int a) {
        int ans = 1;
        while (a > 0) {
            if ((a & 1) != 0) {
                ans = num * ans;
            }
            num = num * num;
            a = a >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fast(2, 4));
        System.out.println(1 ^ 1);
    }
}
