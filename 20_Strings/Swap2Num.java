public class Swap2Num {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 4;

        System.out.println("Before Swap Num1:" + num1 + " Num2:" + num2);
        System.out
                .println("Before Swap Num1:" + Integer.toBinaryString(num1) + " Num2:" + Integer.toBinaryString(num2));

        System.out.println(Integer.toBinaryString(num1));
        num1 = num1 ^ num2;
        System.out.println(Integer.toBinaryString(num1));
        System.out.println(Integer.toBinaryString(num2));

        num2 = num1 ^ num2;
        System.out.println(Integer.toBinaryString(num2));
        System.out.println(Integer.toBinaryString(num1));
        num1 = num1 ^ num2;
        System.out.println("After Swap Num1:" + num1 + " Num2:" + num2);

        System.out
                .println("Before Swap Num1:" + Integer.toBinaryString(num1) + " Num2:" + Integer.toBinaryString(num2));

        int num = 5;
        System.out.println(-~num);
    }
}
