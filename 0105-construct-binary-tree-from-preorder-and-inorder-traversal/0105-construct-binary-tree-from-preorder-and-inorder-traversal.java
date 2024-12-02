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
    HashMap<Integer,Integer> hm = new HashMap<>();
    int preorderIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return helper(preorder,0,inorder.length-1);
    }
    TreeNode helper(int[] preorder,int start,int end){
        if(start>end){
            return null;
        }
        int rootval = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootval);
        int inorderIndex = hm.get(rootval);
        root.left = helper(preorder,start,inorderIndex-1);
        root.right = helper(preorder,inorderIndex+1,end);
        return root;
    }
}