class Solution {
    public double myPow(double x, int n) {
        long N=n;
        while(N<0){
            x=1/x;
            N=-1*N;
        }
        double ans=1;
        while(N>0){
            if(N%2==1){
                ans*=x;
            }
            x*=x;
            N=N/2;
        }
        return ans;
    }
}