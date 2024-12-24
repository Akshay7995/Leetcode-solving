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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,List<int[]>> tm = new TreeMap<>();
        Queue<Object []> q = new LinkedList<>();
        q.offer(new Object[]{root,0,0});
        while(!q.isEmpty()){
            Object[] curr = q.poll();
            TreeNode node = (TreeNode) curr[0];
            int row = (int) curr[1];
            int col = (int) curr[2];
            tm.putIfAbsent(col,new ArrayList<>());
            tm.get(col).add(new int[]{row,node.val});
            if(node.left != null){
                q.offer(new Object[]{node.left,row+1,col-1});
            }
            if(node.right != null){
                q.offer(new Object[]{node.right,row+1,col+1});
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (List<int[]> nodes : tm.values()) {
            nodes.sort((a, b) -> {
                if (a[0] == b[0]) {
                    return Integer.compare(a[1], b[1]); 
                }
                return Integer.compare(a[0], b[0]); 
            });
            List<Integer> columnValues = new ArrayList<>();
            for (int[] node : nodes) {
                columnValues.add(node[1]);
            }
            ans.add(columnValues);
        }
        return ans;
    }
}