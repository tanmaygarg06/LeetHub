class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0 &&nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int r=n-1;
            int t=-1*nums[i];
            while(l<r){
            int sum=nums[l]+nums[r];
            if(sum==t){
                res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                l++;
                r--;
                while(l<n&&nums[l]==nums[l-1]){
                    l++;
                }
                while(r>l&&nums[r]==nums[r+1]){
                    r--;
                }
            }
            else if(sum<t){
                l++;
            }
            else if(sum>t){
                r--;
            }
        }
        }
        return res;
    }
}