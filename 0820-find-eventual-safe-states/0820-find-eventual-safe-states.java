class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] state = new int[n]; 
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (helper(graph, i, state)) {
                l.add(i);
            }
        }
        
        return l;
    }

    private boolean helper(int[][] graph, int node, int[] state) {
        if (state[node] > 0) return state[node] == 2; 
        
        state[node] = 1; 
        for (int next : graph[node]) {
            if (state[next] == 1 || !helper(graph, next, state)) {
                return false; 
            }
        }
        
        state[node] = 2; 
        return true;
    }
}