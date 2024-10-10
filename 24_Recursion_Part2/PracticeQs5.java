public class PracticeQs5 {

    static void TowerOfHanoi(int n, String Source, String Helper, String Destination) {
        // Base Condition:
        if (n == 1) {
            System.out.println("Disk " + n + " moved from Source " + Source + " to destination " + Destination);
            return;
        }

        TowerOfHanoi(n - 1, Source, Destination, Helper);
        System.out.println("Disk " + n + " moved from Source " + Source + " to destination " + Destination);
        TowerOfHanoi(n - 1, Helper, Source, Destination);
    }

    public static void main(String[] args) {

        TowerOfHanoi(2, "S", "H", "D");

    }

}
