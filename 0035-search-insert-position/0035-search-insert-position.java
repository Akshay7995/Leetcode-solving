class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return index;
            }
            else{
                index+=1;
            }
        }
        if(index == nums.length){
            index = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>target){
                    return index;
                }else{
                    index+=1;
                }
            }
        }
        return index;
    }
}