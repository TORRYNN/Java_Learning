// WAP to print all the possible strings of size n without consecutive ones.
public class printBinStringwithoutconsec1 {
    static void printBinString(int n, int lastBit,String str){

        // Base Condition:
        if(n == 0){
            System.out.println(str);
            return;
        }

        printBinString(n-1, 0, str+'0');

        if(lastBit ==0)
            printBinString(n-1, 1, str+'1');


    }

    public static void main(String[] args){
        printBinString(3,0, "");
    }

    
}
