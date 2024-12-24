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
    class Node{
        TreeNode node;
        int index;
        Node(TreeNode node,int index){
            this.node = node;
            this.index = index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(root,0));
        int max = 0;
        while(!q.isEmpty()){
            int level = q.size();
            int start = 0;
            int end = 0;
            for(int i=0;i<level;i++){
                Node curr = q.poll();
                int ind = curr.index;
                if(i==0){
                    start = ind;
                }
                if(i==level-1){
                    end = ind;
                }
                if(curr.node.left != null){
                    q.offer(new Node(curr.node.left,2*curr.index));
                }
                if(curr.node.right != null){
                    q.offer(new Node(curr.node.right,(2*curr.index)+1));
                }
            }
            max = Math.max(max,end-start+1);
        }
        return max;
    }
}