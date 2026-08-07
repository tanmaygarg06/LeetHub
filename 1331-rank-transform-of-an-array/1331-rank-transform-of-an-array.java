class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int b[]=arr.clone();
        Arrays.sort(b);
        HashMap<Integer,Integer> m=new HashMap<>();
        int r=1;
        for(int i=0;i<b.length;i++){
            if(!m.containsKey(b[i])){
                m.put(b[i],r);
                r++;
            }
        }
        int a[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            a[i]=m.get(arr[i]);
        }
        return a;
    }
}