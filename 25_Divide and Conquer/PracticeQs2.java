public class PracticeQs2 {
    // Brute Force Approach
    // Idea: Count the number of times each number occurs in the array & find the largest count.
    // Time Complexity:O(n2);
    public static int MajorityElement(int[] nums) {
        // We know that majorit count we be more than half of the element.
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

    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(MajorityElement(nums));
    }
}
