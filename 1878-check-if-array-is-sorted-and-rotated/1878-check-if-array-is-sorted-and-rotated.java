class Solution {
    public boolean check(int[] nums) {
        int countbreaks = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                countbreaks+=1;
            }
        }
        if(countbreaks>1){
            return false;
        }
        return true;
    }
}