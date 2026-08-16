class Solution {
    public boolean stoneGameIX(int[] stones) {
       int o=0,z=0,t=0;
       for(int i=0;i<stones.length;i++){
        if(stones[i]%3==0){
            z++;
        }
        else if(stones[i]%3==1){
            o++;
        }
        else if(stones[i]%3==2){
            t++;
        }
       }
       if(z%2==0){
        return (o>0 &&t>0);
       }
       return Math.abs(t-o)>2;
    }
}