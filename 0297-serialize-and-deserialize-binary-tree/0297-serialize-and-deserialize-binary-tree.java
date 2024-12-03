/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    StringBuilder sb = new StringBuilder();

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        helper(root,sb);
        return sb.toString();
    }
    void helper(TreeNode node,StringBuilder sb){
        if(node == null){
            sb.append("null,");
            return;
        }
        sb.append(node.val).append(",");
        helper(node.left,sb);
        helper(node.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] tokens = data.split(",");
        Queue<String> queue = new LinkedList<>(Arrays.asList(tokens));
        return helper2(queue);
    }
    TreeNode helper2(Queue<String> queue){
        String value = queue.poll();
        if(value.equals("null")){
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(value));
        node.left = helper2(queue);
        node.right=helper2(queue);

        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));