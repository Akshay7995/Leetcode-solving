class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int ans = 1;
        for(int num : nums){
            q.offer(num);
        }
        for(int i=0;i<k;i++){
            int num = q.poll();
            num +=1;
            q.offer(num);
        }
        while(!q.isEmpty()){
            int number = q.poll();
            ans *=number;
        }
        return ans;
    }
}