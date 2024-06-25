
public class MaxSubarraySum {
    public static void maxSum(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];
                }
                System.out.println(currentSum);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }

        }

        System.out.println("MaxSum= " + maxSum);

    }
    // -----------------------------------------------------------------

    public static void maxsum1(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
            }
            maxSum = Math.max(maxSum, currentSum);
        } 
        System.out.println("Max sum using prefix array = " + maxSum);
    }

    // -----------------------------------------------------------------
    // ! This one does not handle the case when all the elements of the array are
    // negative.
    public static void kadane(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Max sum using Kadane's Algorithm = " + maxSum);

    }

    public static void kadane1(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0, end = 0, tempstart = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempstart;
                end = i;
            }
            if (currentSum < 0) {
                currentSum = 0;
                tempstart = i + 1;
            }
        }
        // Print the subarray with the maximum sum
        System.out.print("Subarray with the maximum sum: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Print the maximum sum
        System.out.println("Max sum using Kadane's Algorithm = " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        maxSum(arr);
        maxsum1(arr);
        kadane(arr);
        kadane1(arr);
    }

}
