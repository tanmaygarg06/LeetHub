class Solution {
    public int removeElement(int[] nums, int val) {
        int off=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[off]=nums[i];
                off++;
            }
        }
        return off;
    }
}