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
class FindElements {
    HashSet<Integer> hs = new HashSet<>();
    public FindElements(TreeNode root) {
        if(root != null){
            helper(root,0);
        }
    }
    public void helper(TreeNode node,int value){
        if(node == null){
            return;
        }
        node.val = value;
        hs.add(node.val);
        helper(node.left,2*value+1);
        helper(node.right,2*value+2);
    }
    
    public boolean find(int target) {
        if(hs.contains(target)){
            return true;
        }
        return false;
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */