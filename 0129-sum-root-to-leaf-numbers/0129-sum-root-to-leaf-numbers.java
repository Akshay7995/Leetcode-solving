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
    public int sumNumbers(TreeNode root) {
        ArrayList<Integer> l = new ArrayList<>();
        int[] sum = {0};
        helper(root,0,sum);
        return sum[0];
    }
    void helper(TreeNode node, int currentsum ,int[] sum){
        if(node == null){
            return;
        }
        currentsum = currentsum*10+node.val;
        if(node.left == null && node.right == null){
            sum[0] = sum[0]+currentsum;
        }
        helper(node.left,currentsum,sum);
        helper(node.right,currentsum,sum);
    }
}
