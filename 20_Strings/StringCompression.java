public class StringCompression {
    public static String compress(String str) {

        StringBuilder sb = new StringBuilder();
        int count = 0;
        char ch = str.charAt(0);
        sb.append(ch);
        for (int i = 0; i < str.length(); i++) {

            if (ch == str.charAt(i)) {
                count++;
            } else {
                if (count>1){
                sb.append(count);
                }
                
                sb.append(str.charAt(i));
                ch = str.charAt(i);
                count = 1;
            }
        }
        if(count>1) 
            sb.append(count);
        
        return sb.toString();
    }
    public static String compress1(String str){
        StringBuffer sb= new StringBuffer();
        for(int i=0;i<str.length();i++){
            int count=1;

            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        String s = "aaabbcccdd";
        System.out.println(compress(s));
        System.out.println(compress("abc"));
        System.out.println(compress("aaabc"));
        System.out.println(compress1("abc"));
        System.out.println(compress1("aaabc"));
    }
}
