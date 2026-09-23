class Solution {
    public int maxScore(int[] cardPoints, int K) {
        int c=0;
        int n=cardPoints.length;
        int res=0;

        for(int i=0;i<K;i++){
            res+=cardPoints[i];
        }

        c=res;

        int low=K-1;
        int high=n-1;

        while(low>=0){
            res-=cardPoints[low];
            res+=cardPoints[high];
            c=Math.max(res,c);
            low--;
            high--;
        }

        return c;
    }
}