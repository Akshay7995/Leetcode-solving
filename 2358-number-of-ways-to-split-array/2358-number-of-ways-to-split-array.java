class Solution {
    public int waysToSplitArray(int[] nums) {
        long total_sum = 0;
        for(int i=0;i<nums.length;i++){
            total_sum +=nums[i];
        }
        int count = 0;
        long present_sum = 0;
        for(int i=0;i<nums.length-1;i++){
            present_sum += nums[i];
            long remaining = total_sum-present_sum;
            if(present_sum >= remaining){
                count++;
            }
        }
        return count;
    }
}