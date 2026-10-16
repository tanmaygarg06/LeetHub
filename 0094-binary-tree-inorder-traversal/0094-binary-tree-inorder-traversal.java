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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        fun(root,l);
        return l;
    }
    public void fun(TreeNode node,List<Integer>l){
        if(node==null){
            return ;
        }
        fun(node.left,l);
        l.add((node.val));
        fun(node.right,l);
    }
}