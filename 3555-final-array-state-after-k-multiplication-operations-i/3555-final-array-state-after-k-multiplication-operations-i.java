class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0]; 
            return a[1] - b[1]; 
        });
        for(int i=0;i<nums.length;i++){
            q.offer(new int[]{nums[i],i});
        }
        for(int i=0;i<k;i++){
            int[] picking = q.poll();
            int index = picking[1];
            nums[index] = nums[index]*multiplier;
            q.offer(new int[]{nums[index],index});
        }
        /*while(!q.isEmpty()){
            int[] picking = q.poll();
            int num = picking[0];
            int index = picking[1];
            nums[index] = num;
        }*/
        return nums;
    }
}