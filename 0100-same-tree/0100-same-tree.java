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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) { 
            return true; 
        } 
        if (p == null || q == null) { 
            return false;
        }
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();

        queue1.add(p);
        queue2.add(q);
        while(!queue1.isEmpty() && !queue2.isEmpty()){
            int level1 = queue1.size();
            int level2 = queue2.size();
            if(level1 !=level2){
                return false;
            }
            for(int i=0;i<level1;i++){
                TreeNode currnode1 = queue1.poll();
                TreeNode currnode2 = queue2.poll();
                if(currnode1.val != currnode2.val){
                    return false;
                }
                if(currnode1.left !=null && currnode2.left !=null){
                    queue1.add(currnode1.left);
                    queue2.add(currnode2.left);
                }else if(currnode1.left != null || currnode2.left !=null){
                    return false;
                }
                if(currnode1.right !=null && currnode2.right!=null){
                    queue1.add(currnode1.right);
                    queue2.add(currnode2.right);
                }else if(currnode1.right !=null || currnode2.right !=null){
                    return false;
                }
            }
        }
        return true;
    }
}