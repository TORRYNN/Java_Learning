public class BitOperation {
    public static int get(int num, int i) {
        int bitmask = 1 << i;

        return num & bitmask;
    }

    public static int set(int num, int i) {
        int bitmask = 1 << i;
        return num | bitmask;
    }

    public static int clear(int num, int i) {
        int bitmask = -1 << i;

        return num & bitmask;
    }

    // Function to clear last i bits
    public static int clearlastibit(int num, int i) {
        int bitmask = -1 << i;
        return num & bitmask;
    }

    // Function to clear the range of bits
    public static int clearrange(int num, int i, int j) {
        int a = -1 << (j + 1);
        int b = (1 << i) - 1;
        int bitmask = a | b;

        return num & bitmask;
    }

    public static int update(int num, int i, int bit) {
        // if(bit == 0){
        // return set(num, i);

        // }
        // else{
        // return clear(num, i);
        // }

        int n = clear(num, i);
        int bitmask = bit << i;
        return num | bitmask;

    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(14));
        System.out.println(Integer.toBinaryString(get(14, 2)));

        System.out.println("----------------------------");
        System.out.println(Integer.toBinaryString(144));
        System.out.println(Integer.toBinaryString(set(144, 2)));

        System.out.println("----------------------------");
        System.out.println(Integer.toBinaryString(144));
        System.out.println(Integer.toBinaryString(clear(144, 5)));

        System.out.println("----------------------------");
        System.out.println(Integer.toBinaryString(144));
        System.out.println(Integer.toBinaryString(clearlastibit(144, 5)));

        System.out.println("----------------------------");
        System.out.println(Integer.toBinaryString(144));
        System.out.println(Integer.toBinaryString(clearrange(144, 2, 5 )));
    }
}
