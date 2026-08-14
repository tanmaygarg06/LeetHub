class Solution {
    public int maximumLengthSubstring(String s) {
        int low=0,high=0,max=Integer.MIN_VALUE;
        Map<Character,Integer>f=new HashMap<>();
        while(high<s.length()){
            char c=s.charAt(high);
            f.put(c,f.getOrDefault(c,0)+1);
            while(f.get(c)>2){
                char r=s.charAt(low);
                f.put(r,f.getOrDefault(r,0)-1);
                if(f.get(r)==0){
                    f.remove(r);
                }
                low++;
            }
            int len=high-low+1;
            max=Math.max(max,len);
            high++;
        }
        return max;
    }
}