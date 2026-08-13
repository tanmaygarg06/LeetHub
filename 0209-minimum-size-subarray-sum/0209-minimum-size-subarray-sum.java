class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0,high=0,min=Integer.MAX_VALUE,s=0;
        while(high<nums.length){
            s+=nums[high];
            while(s>=target){
                int len=high-low+1;
                min=Math.min(min,len);
                s=s-nums[low];
                low++;
            }            
            high++;
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}