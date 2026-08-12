class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int diff=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int s=nums[i]+nums[l]+nums[r];
                int d=Math.abs(s-target);
                if(diff>d){
                    diff=d;
                    sum=s;
                }
                else if(s<target){
                    l++;
                }
                else if(s>target){
                    r--;
                }
                else{
                    return s;
                }
            }
        }
        return sum;
    }
}