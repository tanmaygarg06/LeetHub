class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int p=1;
        int num=n;
        while(n>0){
            sum+=n%10;
            p*=n%10;
            n/=10;
        }
        int s=(sum+p);
        return (num%s==0);
    }
}