class Solution {
    public int maximumWealth(int[][] accounts) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<accounts.length;i++){
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++){
                sum +=accounts[i][j];
            }
            pq.offer(sum);
        }
        return pq.poll();
    }
}