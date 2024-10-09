public class PracticeQs3 {
    static int solution(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return solution(str.substring(1)) + 1;
    }

    public static void main(String[] args) {

        System.out.println(solution("pratham"));
        
    }

}
