class Solution {
    public int minimumPushes(String word) {
        int[] f = new int[26];
        for(char c:word.toCharArray()){
            f[c-'a']++;
        }
        Arrays.sort(f);
        int t=0;
        for(int i=25;i>=0;i--) {
            if(f[i]==0) 
                break;
            int p=(25-i)/8+1;
            t+=p*f[i];
        }
        return t;
    }
}