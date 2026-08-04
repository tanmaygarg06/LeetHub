class Solution {
    public List<Integer> findMissingElements(int[] nums) {       
        List<Integer> l=new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int n=nums[i]+1;
            while(n<nums[i+1]){
                l.add(n);
                n++;
            }
            i++;
        }
        return l;
    }
}