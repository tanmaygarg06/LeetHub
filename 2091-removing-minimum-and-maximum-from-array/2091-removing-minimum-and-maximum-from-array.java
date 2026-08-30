class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int max=0;
        int min=0;
        for(int i=1;i<n;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
            if(nums[min]>nums[i]){
                min=i;
            }
        }
        int fmax=max+1;
        int fmin=min+1;
        int bmax=n-max;
        int bmin=n-min;
        max=Math.min(Math.max(fmax,fmin),Math.max(bmax,bmin));
        min=Math.min(fmax,bmax)+Math.min(fmin,bmin);
        return Math.min(max,min);
    }
}