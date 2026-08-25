class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>m=new HashSet<>();
        for(int x:nums) 
            m.add(x);
        int ans=k;
        while(m.contains(ans))
            ans += k;
        return ans;
    }
}