class Solution {
    public int maximumSum(int[] arr) {
        int max=arr[0],onedel=Integer.MIN_VALUE,res=arr[0];
        for(int i=1;i<arr.length;i++){
            int v1=arr[i];
            int v2=max+arr[i];
            int v3=0;
            if(onedel==Integer.MIN_VALUE){
                v3=arr[i];
            }
            else{
                v3=onedel+arr[i];
            }
            onedel=Math.max(v3,max);
            max=Math.max(v1,v2);
            res=Math.max(res,Math.max(max,onedel));
        }
        return res;
    }
}