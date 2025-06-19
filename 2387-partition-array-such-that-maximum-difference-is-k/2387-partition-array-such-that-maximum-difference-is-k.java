class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int start = nums[0];
        int parts = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-start > k){
                parts+=1;
                start = nums[i];
            }
        }
        return parts+=1;
    }
}