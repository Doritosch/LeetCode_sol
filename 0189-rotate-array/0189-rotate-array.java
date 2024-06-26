class Solution {
    public void rotate(int[] nums, int k) {
        if(k==0) return;

        int length = nums.length;
        k %= length;
        reverse(nums, 0, length - k - 1);
        reverse(nums, length-k, length-1);
        reverse(nums, 0, length-1);

    }
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int left = nums[start];
            nums[start] = nums[end];
            nums[end] = left;
            start++;
            end--;
        }
    }
}