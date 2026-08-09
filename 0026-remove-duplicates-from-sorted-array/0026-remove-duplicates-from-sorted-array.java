class Solution {
    public int removeDuplicates(int[] nums) {
        int off=0;
        int cm=1,k=1;
        int n=nums.length;
        while(cm<n){
            if(nums[cm]==nums[cm-1]){
                cm++;
                continue;
            }
            else{
                nums[off+1]=nums[cm];
                off++;
                cm++;
                k++;
            }
        }
        return k;
    }
}