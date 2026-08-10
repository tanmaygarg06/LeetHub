class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        int i=0,k=n-1,j=n-1;
        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                a[k]=nums[i]*nums[i];
                i++;
                k--;
            }
            else{
                a[k]=nums[j]*nums[j];
                j--;
                k--;
            }
        }
        return a;
    }
}