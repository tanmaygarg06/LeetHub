class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int s=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<nums.length;i++){
            c=c+nums[i];
            s=Math.max(s,c);
            if(c<0){
                c=0;
            }
        }
        return s;
    }
}