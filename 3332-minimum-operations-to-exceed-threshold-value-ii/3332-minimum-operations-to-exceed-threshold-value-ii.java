class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long num : nums){
            pq.offer(num);
        }
        if(pq.peek()>=k){
            return 0;
        }
        while(pq.size()>1 && pq.peek()<k){
            long a = pq.poll();
            long b = pq.poll();
            long new_num = (a*2)+b;
            pq.offer(new_num);
            count++;
        }
        return pq.peek()>=k ? count : -1;
    }
}