class Solution {
    public int smallestNumber(int n, int t) {
        int num=n;
        while(true){
            if(mul(num)%t==0){
                return num;
            }
            num++;
        }
    }
    public int mul(int n){
        int p=1;
        while(n>0){
            int d=n%10;
            p=p*d;
            n=n/10;
        }
        return p;
    }
}