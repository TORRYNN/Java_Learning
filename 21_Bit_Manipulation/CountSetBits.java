public class CountSetBits {
    public static int Count(int num){

        int count = 0;
        while(num > 0){
            if((num&1)!=0){
                count++;
            }
            num=num>>1;
        }
        return count;
    }

    // TimeComplexity=O(logn) Because while loop executes for n number of times where n is the number of bits in the number whici is equal to logn.

    // SpaceComplexity=O(1) Because there is no extra space required.
    
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(144));
        System.out.println(Count(144));

    }
}
