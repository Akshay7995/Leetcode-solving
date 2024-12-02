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
    int ans = -1;
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        helper(root,l);

        return l.get(k-1);
    }
    void helper(TreeNode node,ArrayList<Integer> l){
        if(node == null){
            return;
        }
        helper(node.left,l);
        l.add(node.val);
        helper(node.right,l);
    }
}