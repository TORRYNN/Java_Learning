public class Factorial {
   static int CalFactorial(int n){
        if(n==0){
            return 1;
        }
        return CalFactorial(n-1)*n;
    }
    public static void main(String[] args){
       System.out.println(CalFactorial(5));
    }
}
