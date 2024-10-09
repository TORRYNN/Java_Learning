public class PracitceQs4 {
    public static int solution(String s,int start,int end){
        // Base Condition: If the starting index exceds the ending index.
        if(start>end){
            return 0;
        }
        // Initialise count current recursive call
        int count = 0;

        // Check if the substring from start to end is valid (i.e ,starts and ends with the same character)
        if(s.charAt(start)==(s.charAt(end))){
            count=1;
        }
        
        // Recursive call for smaller substring by moving the start index to the end index

        return count+ solution(s, start+1, end)
                    + solution(s, start,end-1)
                    - solution(s, start+1,end-1);

        // Move start forward:solution(s,start+1,end): This call executes the character at the start position and looks for substring starting from start+1 to end.
        // Move end backward: solution(s,start,end-1): This call executes the character at the end  position and looks for substring starting from start to end-1;
        // Exclude both start and end : solution(s,start+1,end-1):This call excludes both start and end characters and looks for substring starting from start+1 to end-1.

    }


    public static void main(String[] args) {
        String S1 = "abcab";
        System.out.println(solution(S1, 0, S1.length()-1));

    }
}
