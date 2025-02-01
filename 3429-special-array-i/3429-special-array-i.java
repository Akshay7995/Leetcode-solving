class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int i = 1;
        while(i<nums.length){
            if(checking(nums[i-1]) == checking(nums[i])){
                return false;
            }
            i+=1;
        }
        return true;
    }
    private boolean checking(int num){
        if(num%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}