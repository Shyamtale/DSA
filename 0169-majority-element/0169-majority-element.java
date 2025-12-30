class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num; // New candidate when count drops to 0
            }
            count += (num == candidate) ? 1 : -1;
        }
        
        return candidate; // Guaranteed to be the majority element
    }
}