class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer>f=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            f.put(arr[i],f.getOrDefault(arr[i],0)+1);
        }
        int max=-1;
        for(Map.Entry<Integer,Integer>e:f.entrySet()){
            int val=e.getValue();
            int k=e.getKey();
            if(val==k){
                max=Math.max(max,k);
            }
        }
        return max; 
    }
}