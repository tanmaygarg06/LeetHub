/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        fun(root,p,q);
        return ans;
    }
    public int fun(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return 0;
        }
        int l=fun(root.left,p,q);
        int r=fun(root.right,p,q);
        int s=0;
        if(root.val==p.val ||root.val==q.val){
            s=1;
        }
        int t=l+r+s;
        if(t==2 && ans==null){
            ans=root;
        }
        return t;
    }
}