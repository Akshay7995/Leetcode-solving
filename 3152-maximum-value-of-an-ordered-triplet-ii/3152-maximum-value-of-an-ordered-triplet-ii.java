class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if(n<3){
            return 0;
        }
        int[] leftmax = new int[n];
        leftmax[0] = nums[0];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(leftmax[i-1],nums[i]);
        }

        int[] rightmax = new int[n];
        rightmax[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(nums[i],rightmax[i+1]);
        }

        long ans = 0;
        for(int i=1;i<n-1;i++){
            int left = leftmax[i-1];
            int right = rightmax[i+1];
            ans = Math.max(ans,(long)(left-nums[i])*right);
        }
        return ans;
    }
}