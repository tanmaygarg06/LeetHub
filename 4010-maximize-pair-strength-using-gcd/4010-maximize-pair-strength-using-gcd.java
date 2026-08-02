class Solution {
    public long maxPairStrength(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        long s=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                long a=nums[i];
                long b=nums[j];
                long g=gcd(a,b);
                s=Math.max(((a*b)/(g*g)),s);
            }
        }
        return s;
    }
    public long gcd(long a,long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}