class Solution {
    public boolean checkInclusion(String S1, String S2) {
        int n=S1.length();
        int m=S2.length();

        if(n>m){
            return false;
        }

        int c1[]=new int[26];
        int c2[]=new int[26];

        for(int i=0;i<n;i++){
            c1[S1.charAt(i)-'a']++;
        }

        int len=n;

        for(int i=0;i<len;i++){
            c2[S2.charAt(i)-'a']++;
        }

        if(same(c1,c2)){
            return true;
        }

        for(int i=len;i<m;i++){
            c2[S2.charAt(i)-'a']++;
            c2[S2.charAt(i-len)-'a']--;

            if(same(c1,c2)){
                return true;
            }
        }

        return false;
    }

    public boolean same(int c1[],int c2[]){
        for(int i=0;i<26;i++){
            if(c1[i]!=c2[i]){
                return false;
            }
        }
        return true;
    }
}