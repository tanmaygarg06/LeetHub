class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        int i=1;
        while(i<num){
            if(isdiv(i,num)){
                sum+=i;
            }
            i++;
        }
        return (sum==num);
    }
    public boolean isdiv(int i,int num){
        if(num%i==0){
            return true;
        }
        return false;
    }
}