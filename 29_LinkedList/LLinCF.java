import java.util.LinkedList;

public class LLinCF{
    
    public static void main(String[] args) {
        LinkedList<Integer> LL=new LinkedList<>();

        LL.addLast(1);
        LL.addLast(2);
        LL.addFirst(0);
        System.out.println(LL);
        System.out.println(LL.size() );
    }
}