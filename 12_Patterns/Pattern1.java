import java.util.Scanner;
// *
// **
// ***
// **** 
// ***** 

// 1
// 12
// 123
// 1234
// 12345

// 1
// 22
// 333
// 4444
// 55555

// ***** 
// **** 
// ***
// **
// *

// A
// BC
// DEF
// GHIJ
// KLMNOP

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    System.out.println("-----------INVETED * PATTERN-----------------");
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
        char ch='A';
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
    

        ch='A';
    for (int i = n; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
    

    sc.close();
    }
    
}
