class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int low=0,high=0;
        Map<Integer,Integer>f=new HashMap<>();
        int max=Integer.MIN_VALUE;
        while(high<nums.length){
            int c=nums[high];
            f.put(c,f.getOrDefault(c,0)+1);
            while(f.get(c)>k){
                int r=nums[low];
                f.put(r,f.getOrDefault(r,0)-1);
                if(f.get(r)==0){
                    f.remove(r);
                }
                low++;
            }
            int len=high-low+1;
            max=Math.max(len,max);
            high++;
        }
        return max;
    }
}