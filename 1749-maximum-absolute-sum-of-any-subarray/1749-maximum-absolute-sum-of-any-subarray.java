class Solution {
    public int maxAbsoluteSum(int[] nums) {
        if(nums.length==1){
            return Math.abs(nums[0]);
        }
        int max=nums[0],min=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=nums[i]+max;
            int v3=nums[i]+min;
            max=Math.max(v1,v2);
            min=Math.min(v1,v3);
            res=Math.max(res,Math.max(Math.abs(max),Math.abs(min)));
        }
        return res;
    }
}