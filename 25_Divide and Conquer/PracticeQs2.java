public class PracticeQs2 {
    // Brute Force Approach
    // Idea: Count the number of times each number occurs in the array & find the
    // largest count.
    // Time Complexity:O(n2);
    public static int MajorityElement(int[] nums) {
        // We know that majority count we be more than half of the element.
        int majoritycount = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > majoritycount) {
                return nums[i];
            }
        }
        return -1;

    }

    // Optimised Approach
    private static int countInRange(int[] numbers, int num, int low, int high) {
        int count = 0;
        for (int i = 0; i <= high; i++) {
            if (numbers[i] == num) {
                count++;

            }
        }
        return count;
    }

    // Recursive function to find the majority element;
    public static int majoritElementCount(int[] numbers, int low, int high) {
        if (low == high) {
            return numbers[low];
        }
        // Recurse on left and right halves of this slice.
        int mid = low + (high - low) / 2;
        int left = majoritElementCount(numbers, low, mid);
        int right = majoritElementCount(numbers, mid + 1, high);

        if (left == right) {
            return left;
        }
        // Otherwise,count each element and return the "winner".
        int leftCount = countInRange(numbers, left, low, high);
        int rightCount = countInRange(numbers, right, low, high);

        return leftCount > rightCount ? left : right;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 1, 1, 3, 7 };
        System.out.println(MajorityElement(nums));
        System.out.println(majoritElementCount(nums, 0, nums.length - 1));
    }
}
