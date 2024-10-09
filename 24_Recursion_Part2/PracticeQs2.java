public class PracticeQs2 {
    static void solution(int n){
        String[] digit={"zero","one","two","three","four","five","six","seven","eight","nine"};

        if(n==0){
            return;
        }

        int dig=n%10;
        
        solution(n/10);
        System.out.print(digit[dig]+" ");
    }

    public static void main(String[] args){
        solution(109);
    }
}
