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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> l = new ArrayList<>();
        helper(root,l);
        return l;
    }
    private void helper(TreeNode root,ArrayList<Integer> l){
        if(root == null){
            return;
        }
        l.add(root.val);
        helper(root.left,l);
        helper(root.right,l);
        
    }
}