class Solution {
    public List<Integer> findAnagrams(String S, String P) {
        int n=P.length();
        int m=S.length();
        List<Integer>l=new ArrayList<>();
        if(n>m){
            return l;
        }
        int c1[]=new int[256];
        int c2[]=new int[256];
        
        for(int i=0;i<P.length();i++){
            c1[P.charAt(i)]++;
        }
        int len=n;
        for(int i=0;i<len;i++){
            c2[S.charAt(i)]++;
        }
        if(same(c1,c2)){
            l.add(0);
        }
        for(int i=len;i<m;i++){
            c2[S.charAt(i)]++;
            c2[S.charAt(i-len)]--;
            if(same(c1,c2)){
                l.add(i-len+1);
            }
        }
    return l;
  }
  public boolean same(int c1[],int c2[]){
    for(int i=0;i<256;i++){
      if(c1[i]!=c2[i]){
        return false;
      }
    }
    return true;
  
    }
}