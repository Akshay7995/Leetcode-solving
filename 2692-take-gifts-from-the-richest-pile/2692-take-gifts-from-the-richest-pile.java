class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int gift:gifts){
            q.offer(gift);
        }
        for(int i=0;i<k;i++){
            if(!q.isEmpty()){
                int largest = q.poll();
                int reduced = (int)Math.sqrt(largest);
                q.offer(reduced);
            }
        }
        long sum = 0;
        while(!q.isEmpty()){
            sum+=q.poll();
        }
        return sum;
    }
}