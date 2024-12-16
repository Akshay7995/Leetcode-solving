class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] arr = new int[2];
        for(int i=0;i<k;i++){
            arr = helper(nums); 
            nums[arr[1]] = arr[0]*multiplier;
        }
        return nums;
    }
    static int[] helper(int[] nums){
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
                index = i;
            }
        }
        return new int[]{min,index};
    }
}