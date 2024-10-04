import java.util.HashSet;

public class duplicateString {
    static String dup(String input,HashSet<Character> seen,int i, StringBuilder output) {
        if(i==input.length()){
            return output.toString();
        }

        char ch=input.charAt(i);

        if(!seen.contains(ch)){
            seen.add(ch);
            output.append(ch);
        }
        return dup(input,seen,i+1,output);
    }
    public static void main(String[] args){
        String st="prathampratham";
        HashSet<Character> seen=new HashSet<>();
        System.out.println(dup(st,seen,0,new StringBuilder()));

    }
    
}
