class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int d=sum(nums[i]);
            if(d==i){
                return i;
            }
        }
        return -1;
    }
    public static int sum(int n){
        int sum=0;
        while(n>0){
            int a=n%10;
            sum+=a;
            n/=10;
        }
        return sum;
    }
}