

public class tiling {
    // n is the length of the surface 2 X n
    static int tilingproblem(int n){

        int vert=tilingproblem(n-1);
        int horiz=tilingproblem(n-2);
        int totalways=vert+horiz;
        return totalways;

    }
    public static void main(String[] args){
        int n=5;
        System.out.println(tilingproblem(n));

    }
    
}
