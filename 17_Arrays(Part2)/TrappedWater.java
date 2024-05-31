
public class TrappedWater {
    public static int trap(int arr[]) {

        int n = arr.length;
        // Calculating left max boundary
        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
        }

        // Calculating right max boundary
        int rightmax[] = new int[n];
        rightmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
        }

        // Calculating the trapped Water:
        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            trappedwater += waterlevel - arr[i];
        }

        return trappedwater;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 3, 6, 2, 5 };
        System.out.println(trap(arr));
    }
}
