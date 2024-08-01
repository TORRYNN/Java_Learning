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

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(14));
        System.out.println(Integer.toBinaryString(get(14, 2)));

        System.out.println("----------------------------");
        System.out.println(Integer.toBinaryString(144));
        System.out.println(Integer.toBinaryString(set(144, 2)));

        System.out.println("----------------------------");
        System.out.println(Integer.toBinaryString(144));
        System.out.println(Integer.toBinaryString(clear(144, 5)));

    }
}
