class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Integer>f=new HashMap<>();
        int low=0;
        int high=k;
        while(high<=nums.length){
            Set<Integer>set=new HashSet<>();
            for(int i=low;i<high;i++){
                set.add(nums[i]);
            }
            for(int x:set){
                f.put(x,f.getOrDefault(x,0)+1);
            }
            low++;
            high++;
        }
        int ans=-1;
        for(int x:f.keySet()){
            if(f.get(x)==1){
                ans=Math.max(ans,x);
            }
        }
        return ans;
    }
}
