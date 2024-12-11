class Solution {
    public int maxSubArray(int[] nums) {
        int currentmax = nums[0];
        int globalmax = nums[0];

        for(int i=1;i<nums.length;i++){
            currentmax = Math.max(nums[i],currentmax+nums[i]);
            if(currentmax>globalmax){
                globalmax = currentmax;
            }
        }
        return globalmax;
    }
}