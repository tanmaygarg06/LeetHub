class Solution {
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        int t[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                t[i][j]=-1;
            }
        }
        return knap(piles,t);
    }
    public boolean knap(int[] piles,int[][] t){
        int n=piles.length;
        for(int i=0;i<n;i++){
            t[i][i]=piles[i];
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i+1;j<n;j++){
                t[i][j]=Math.max(piles[i]-t[i+1][j],piles[j]-t[i][j-1]);
            }
        }
        return t[0][n-1]>0;
        
        
    }
}