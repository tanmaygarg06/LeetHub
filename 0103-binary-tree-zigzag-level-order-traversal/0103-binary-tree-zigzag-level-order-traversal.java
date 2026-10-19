/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        if(root==null){
            return new ArrayList();
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int flag=1;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>l=new ArrayList<>(
                Collections.nCopies(size,0)
            );
            int f=0;
            int e=q.size()-1;
            while(size-->0){
                TreeNode t=q.peek();
                q.poll();
                if(flag==1){
                    l.set(f,t.val);
                    f++;
                }
                else{
                    l.set(e,t.val);
                    e--;
                }
                if(t.left!=null){
                    q.add(t.left);
                }
                if(t.right!=null){
                    q.add(t.right);
                }
            }
            res.add(l);
            flag=1-flag;
        }
        return res;
    }
}