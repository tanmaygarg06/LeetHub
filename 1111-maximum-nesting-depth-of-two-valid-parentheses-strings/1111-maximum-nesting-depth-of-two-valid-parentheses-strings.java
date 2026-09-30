class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int c=0;
        int res[]=new int[seq.length()];
        for(int i=0;i<res.length;i++){
            char ch=seq.charAt(i);
            if(ch=='('){
                c++;
                res[i]=c%2;
            }
            else{
                res[i]=c%2;
                c--;
            }
        }
        return res;
    }
}