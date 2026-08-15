class Solution {
    public int totalFruit(int[] fruits) {
        int low=0,high=0,max=0;
        Map<Integer,Integer>f=new HashMap<>();
        while(high<fruits.length){
            int c=fruits[high];
            f.put(c,f.getOrDefault(c,0)+1);
            while(f.size()>2){
                int r=fruits[low];
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