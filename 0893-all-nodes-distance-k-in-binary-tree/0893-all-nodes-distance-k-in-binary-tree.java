import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();
            if (currNode.left != null) {
                parentMap.put(currNode.left, currNode);
                queue.add(currNode.left);
            }
            if (currNode.right != null) {
                parentMap.put(currNode.right, currNode);
                queue.add(currNode.right);
            }
        }
        Set<TreeNode> visited = new HashSet<>();
        queue.offer(target);
        visited.add(target);
        while (k > 0 && !queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode top = queue.poll();
                if (top.left != null && !visited.contains(top.left)) {
                    queue.offer(top.left);
                    visited.add(top.left);
                }
                if (top.right != null && !visited.contains(top.right)) {
                    queue.offer(top.right);
                    visited.add(top.right);
                }
                if (parentMap.containsKey(top) && !visited.contains(parentMap.get(top))) {
                    queue.offer(parentMap.get(top));
                    visited.add(parentMap.get(top));
                }
            }
            k--;
        }
        while (!queue.isEmpty()) {
            result.add(queue.poll().val);
        }
        return result;
    }
}
