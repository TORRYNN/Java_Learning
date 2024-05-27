
public class Question4 {
    public static void operation(int a, int b) {
        System.out.println("Min of (" + a + "," + b + ") : " + Math.min(a, b));
        System.out.println("Max of (" + a + "," + b + ") : " + Math.max(a, b));
        System.out.println("Sqaure root of " + b + " : " + Math.sqrt(b));
        System.out.println(b + " to the power " + a + " = " + Math.pow(b, a));
        System.out.println(Math.abs(-5.242));

    }

    public static void main(String[] args) {
        operation(3, 2);
    }
}
