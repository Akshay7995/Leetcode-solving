class Solution {
    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        int n = heights.length;
        int[] ans = new int[queries.length];
        Arrays.fill(ans,-1);
        List<List<int[]>> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int i=0;i<queries.length;i++){
            int alice = queries[i][0];
            int bob = queries[i][1];
            if(alice > bob){
                int temp = alice;
                alice = bob;
                bob = temp;
            }
            if(alice == bob || heights[alice]<heights[bob]){
                ans[i] = bob;
            }else{
                l.get(bob).add(new int[]{heights[alice],i});
            }
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for(int i=0;i<n;i++){
            int height = heights[i];
            for(int[] q:l.get(i)){
                pq.offer(q);
            }
            while(!pq.isEmpty() && pq.peek()[0]<height){
                int[] query = pq.poll();
                int queryindex = query[1];
                ans[queryindex] = i;
            }
        }
        return ans;
    }
}