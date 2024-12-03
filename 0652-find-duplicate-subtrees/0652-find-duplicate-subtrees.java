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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        HashMap<String,Integer> hm = new HashMap<>();
        List<TreeNode> l = new ArrayList<>();
        helper(root,hm,l);
        return l;
    }
    String helper(TreeNode node,HashMap<String,Integer> hm,List<TreeNode> l){
        if(node == null){
            return "#";
        }
        String serialize = node.val+","+helper(node.left,hm,l)+","+helper(node.right,hm,l);
        hm.put(serialize,hm.getOrDefault(serialize,0)+1);
        if(hm.get(serialize)==2){
            l.add(node);
        }
        return serialize;
    }
}