class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
        int neww=0;
        for(int i=0;i<nums.length;i++){
           
            if(nums[i]==1){
                sum++;
                neww=Math.max(sum,neww);
            }else{
                sum=0;
            }
        }
        return neww ;
    }
}