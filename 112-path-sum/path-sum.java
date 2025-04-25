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
    boolean ans=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        helper(root, targetSum-root.val);
        return ans;
    }
    public void helper(TreeNode root, int n){
        if(n==0 && root.left==null && root.right==null){
            ans= true;
            return;
        }
        if(root.left!=null){
            helper(root.left, n-root.left.val);
        }
        if(root.right!=null){
            helper(root.right, n-root.right.val);
        }
    }
}