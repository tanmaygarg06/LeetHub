class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>f=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            f.put(ch,f.getOrDefault(ch,0)+1);
        }   
        String res="";
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(f.get(c)>max){
                max=f.get(c);
            }
        }
        while(max>0){
            for(char c:f.keySet()){
                if(f.get(c)==max){
                    for(int i=0;i<max;i++)
                        res+=c;
                }
            }
            max--;
        }
        return res;
    }
}