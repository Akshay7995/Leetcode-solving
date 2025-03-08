class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num<min){
                min = num;
            }
            if(num>max){
                max = num;
            }
        }
        int min_index = 0;
        int max_index = 0;
        for(int i=0;i<nums.length;i++){
            if(min == nums[i]){
                min_index = i;
            }
            if(max == nums[i]){
                max_index = i;
            }
        }
        int front = Math.max(min_index,max_index)+1;
        int back = nums.length-Math.min(min_index,max_index);
        int mid = Math.min(min_index + 1 + (nums.length - max_index), max_index + 1 + (nums.length - min_index));

        int ans = Math.min(front,back);
        ans = Math.min(ans,mid);
        return ans;
    }
}