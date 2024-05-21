import java.util.Scanner;

public class Question3 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        Float eraser=sc.nextFloat();
        float sum=pencil+pen+eraser;
        float Price= sum+ (sum*18)/100;

        System.out.println("Final Price excluding 18% GST "+ sum);
        System.out.println("Final Price including 18% GST "+ Price);

        sc.close();

    }
    
}
