class Solution {
    public long continuousSubarrays(int[] nums) {
        int start = 0;
        long count = 0;
        int min_val = nums[0];
        int max_val = nums[0];
        for(int end=0;end<nums.length;end++){
            min_val = Math.min(min_val,nums[end]);
            max_val = Math.max(max_val,nums[end]);
            while(max_val-min_val>2){
                start++;
                min_val = nums[start];
                max_val = nums[start];
                for(int i=start;i<=end;i++){
                    min_val = Math.min(min_val,nums[i]);
                    max_val = Math.max(max_val,nums[i]);
                }
            }
            count +=(end-start+1);
        }
        return count;
    }
}