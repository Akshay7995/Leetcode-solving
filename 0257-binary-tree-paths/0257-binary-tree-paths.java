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
        List<String> l = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(root,l,sb);
        return l;
    }
    private void helper(TreeNode root, List<String> l, StringBuilder sb){
        if(root == null){
            return;
        }
        int lengthbefore = sb.length();
        sb.append(root.val);
        if(root.left == null && root.right == null){
            l.add(sb.toString());
        }else{
            sb.append("->");
            helper(root.left,l,sb);
            helper(root.right,l,sb);
        }
        sb.setLength(lengthbefore);
    }
}