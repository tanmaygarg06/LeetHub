class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> f = new HashMap<>();
        f.put(0, 1);
        int sum = 0;
        int c = 0;
        int i = 0;
        while (i < nums.length) {
            sum += nums[i];
            if (f.containsKey(sum - k)) {
                c += f.get(sum - k);
            }
            f.put(sum, f.getOrDefault(sum, 0) + 1);
            i++;
        }        
        return c;
    }
}
