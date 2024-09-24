public class Fibonacci {
    static int Fib(int n) {
        if (n <= 1) {
            return 1;
        }

        return Fib(n - 1) + Fib(n - 2);

    }

    public static void main(String[] args) {
        System.out.println(Fib(3));
    }

}

// 0 1 1 2 3 5 8 13 21
