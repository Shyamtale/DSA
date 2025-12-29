class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute force approach
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {}; // Shouldn't reach here due to constraints
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Create object of Solution to call instance method
        Solution sol = new Solution();
        int[] result = sol.twoSum(nums, target);

        // Print result properly
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}
