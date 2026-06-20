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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> arr=new ArrayList<>();
        func(root,"",arr);
        return arr;
    }
    public void func(TreeNode root,String str,List<String> ans){
        if(root==null)return;
        if(root.left==null && root.right==null){
            ans.add(str+root.val);
            return;
        }
        func(root.left,str+root.val+"->",ans);
        func(root.right,str+root.val+"->",ans);


    }
}
