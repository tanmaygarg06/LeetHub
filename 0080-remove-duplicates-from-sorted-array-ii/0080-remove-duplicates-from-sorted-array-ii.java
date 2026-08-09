class Solution {
    public int removeDuplicates(int[] nums) {
        int off=0;
        int k=1,c=1;
        int cm=1;
        while(cm<nums.length){
            if(nums[cm]==nums[cm-1]){
                c++;
            }
            else{
                c=1;
            }
            if(c<=2){
                nums[off+1]=nums[cm];
                off++;
                k++;
            }
            cm++;
            
        }
        return k;
    }
}