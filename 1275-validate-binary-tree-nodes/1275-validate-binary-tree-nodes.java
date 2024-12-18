class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        boolean[] checking = new boolean[n];
        
        for (int child : leftChild) {
            if (child != -1) {
                checking[child] = true;
            }
        }
        for (int child : rightChild) {
            if (child != -1) {
                if (checking[child]) { 
                    return false;
                }
                checking[child] = true;
            }
        }
        int root = -1;
        for (int i = 0; i < n; i++) {
            if (!checking[i]) { 
                if (root == -1) {
                    root = i;
                } else { 
                    return false;
                }
            }
        }
        if (root == -1) { 
            return false;
        }
        
        return helper(root, n, leftChild, rightChild);
    }

    private boolean helper(int root, int n, int[] leftChild, int[] rightChild) {
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(root);
        visited[root] = true;
        int visitedCount = 0;

        while (!q.isEmpty()) {
            int curr = q.poll();
            visitedCount++;
            
            if (leftChild[curr] != -1) {
                if (visited[leftChild[curr]]) { 
                    return false;
                }
                q.offer(leftChild[curr]);
                visited[leftChild[curr]] = true;
            }
            
            if (rightChild[curr] != -1) {
                if (visited[rightChild[curr]]) { 
                    return false;
                }
                q.offer(rightChild[curr]);
                visited[rightChild[curr]] = true;
            }
        }

        return visitedCount == n;
    }
}
