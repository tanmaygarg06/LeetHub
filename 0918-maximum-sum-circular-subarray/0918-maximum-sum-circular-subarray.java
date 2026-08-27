class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int res=nums[0];
        int min=nums[0];
        int max=nums[0];
        int bm=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=max+nums[i];
            int v3=min+nums[i];
            max=Math.max(v1,v2);
            bm=Math.max(bm,max);
            min=Math.min(v1,v3);
            res=Math.max(res,Math.max(max,(sum-min)));
        }
        if(sum==min){
            return bm;
        }
        return res;
    }
}