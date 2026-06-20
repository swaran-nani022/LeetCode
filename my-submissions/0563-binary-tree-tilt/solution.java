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
    int a=0;
    public int findTilt(TreeNode root) {
        // a=0;
        func(root);
        return a;
    }
    public int func(TreeNode root){
        if(root==null)return 0;
        
        int left=func(root.left);
        int right=func(root.right);
        int cur=Math.abs(left-right);
        a+=cur;
        return root.val+left+right;
    }
}
