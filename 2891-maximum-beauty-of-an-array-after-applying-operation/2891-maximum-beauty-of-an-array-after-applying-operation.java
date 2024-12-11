class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int maxbeauty = 0;
        int start = 0;
        for(int end=0;end<nums.length;end++){
            while(nums[end]-nums[start]>2*k){
                start++;
            }
            maxbeauty = Math.max(maxbeauty,end-start+1);
        }
        return maxbeauty;
    }
}