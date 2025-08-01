
import java.util.HashMap;
import java.util.Map;
public class twosum {

    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {}; 
    }

    public int[] twoSumOptimized(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // number -> index
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution sol = new Solution();

  
        int[] result1 = sol.twoSumBruteForce(nums, target);
        System.out.println("Brute Force Output: [" + result1[0] + ", " + result1[1] + "]");


        int[] result2 = sol.twoSumOptimized(nums, target);
        System.out.println("Optimized Output: [" + result2[0] + ", " + result2[1] + "]");
    }
}


