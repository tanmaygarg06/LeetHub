class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int high=0;
        int res=0;
        Map<Character,Integer> f=new HashMap<>();
        while(high<s.length()){
            char c=s.charAt(high);
            f.put(c,f.getOrDefault(c,0)+1);
            while(f.get(c)>1){
                char r=s.charAt(low);
                f.put(r,f.get(r)-1);
                if(f.get(r)==0){
                    f.remove(r);
                }
                low++;
            }
            int len=high-low+1;
                res=Math.max(res,len);
                high++;
        }
        return res;
    }
}