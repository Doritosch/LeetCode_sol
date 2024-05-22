class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length <= 2) return true;

        int sign = nums[0] - nums[1];
        for(int i=1; i<nums.length-1; i++){
            if(sign == 0) sign = nums[i] - nums[i+1];
            else if(sign * (nums[i] - nums[i+1]) < 0) return false;
        }
        return true;
    }
}