class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            pq.offer(num);
        }
        int i = 0;
        int ans=0;
        while(i!=k){
            ans = pq.poll();
            i+=1;
        }
        return ans;
    }
}