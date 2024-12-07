class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int low = 1;
        int high = 0;
        int ans = -1;
        for(int i=0;i<nums.length;i++){
            high = Math.max(high,nums[i]);
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(helper(nums,mid,maxOperations)){
                high = mid-1;
                ans = mid;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    boolean helper(int[] nums,int val,int maxOperations){
        int operations = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=val){
                continue;
            }
            operations = operations+(nums[i]/(val));
            if(nums[i]%val == 0){
                operations--;
            }
        }
        return operations<=maxOperations;
    }
}