class duplicate {
public static void main (String args[]){
    removeDuplicates(int nums);
}

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; 
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;             
                nums[i] = nums[j]; 
            }
        }
        return i + 1; 
    }
}
//here we used two pointer approach , basically here two vairables are declare one after one and then act according to the situation 