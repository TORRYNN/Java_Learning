public class GridWay {
    public static int gridways(int i, int j, int n, int m) {
        // Base Case
        if (i == n - 1 && j == m - 1) { // Condition for last cell
            return 1;
        } else if (i == n || j == n) {
            return 0;

        }

        int way1 = gridways(i + 1, j, n, m);
        int way2 = gridways(i, j + 1, n, m);
        return way1 + way2;
    }
    // Time Complexity:O(2^n)

    //Direct Mathematical Approach
    // Formula: (n-1+m-1)!/(n-1)!(m-1)! 
    public static int factorial(int num){
        // Base Call
        if((num == 0)||(num == 1)){
            return 1;
        }
        
        
        return num*factorial(num-1);
    }

    public static int optimisedgridway(int n,int m){
        int num = n-1+m-1;
        

        return factorial(num)/(factorial(n-1)*factorial(m-1));
    }
    // Time Complexity:O(n+m)
    
    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println("No of ways: " + gridways(0, 0, n, m));
        System.out.println("No of ways: " + optimisedgridway(n, m));

    }
}
