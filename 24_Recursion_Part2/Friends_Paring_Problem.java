public class Friends_Paring_Problem {
    static int pairingCount(int n) {

        // Base Condition
        if (n == 1 || n == 2)
            return n;

        int nm1 = pairingCount(n - 1);
        int nm2 = (n - 1) * pairingCount(n - 2);

        int totalways = nm1 + nm2;
        return totalways;
    }

    public static void main(String[] args) {
        System.out.println(pairingCount(3));
    }
}
