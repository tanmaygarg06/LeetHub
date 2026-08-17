class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> f = new HashMap<>();
        f.put(0, 1);
        int s = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
            if (f.containsKey(s-goal)) {
                c +=f.get(s-goal);
            }
            f.put(s,f.getOrDefault(s, 0) + 1);
        }
        return c;
    }
}
