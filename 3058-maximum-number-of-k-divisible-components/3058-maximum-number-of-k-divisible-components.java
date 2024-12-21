class Solution {
    static int ans;
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<List<Integer>> adj = new ArrayList();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList());
        }
        for (int[] arr : edges) {
            adj.get(arr[0]).add(arr[1]);
            adj.get(arr[1]).add(arr[0]);
        }
        ans = 0;
        helper(adj, values, 0, -1, k);
        return ans;
    }

    private int helper(List<List<Integer>> adj, int[] values, int cur, int parent, int k) {
        int val = values[cur];
        List<Integer> l = adj.get(cur);
        for (int i : l) {
            if (i != parent) {
                val += helper(adj, values, i, cur, k);
            }
        }
        if (val % k == 0) {
            ans++;
            return 0;
        }
        return val%k;
    }
}