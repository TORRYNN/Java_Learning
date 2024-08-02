public class PracticeQuestion {
    // Function to add 1 to an integer value
    public static int add(int num) {
        System.out.println(Integer.toBinaryString(num));
        num = ~num;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(num);
        num = -num;
        System.out.println(Integer.toBinaryString(num));

        return num;
    }

    public static void main(String[] args) {
        System.out.println(add(14));
    }

}
