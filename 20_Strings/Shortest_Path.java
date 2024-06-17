public class Shortest_Path {
    public static double pathLength(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'W') {
                x--;
            } else if (str.charAt(i) == 'N') {
                y++;
            } else {
                y--;
            }

        }

        return Math.sqrt((x * x) + (y * y));

    }

    // T.C=O(n)
    // S.C=O(1)

    public static void main(String[] args) {
        System.out.println(pathLength("WNEENESENNN"));
    }

}
