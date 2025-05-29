class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(search(nums[i])){
                ans+=1;
            }
        }
        return ans;
    }
    boolean search(int num){
        int len = 0;
        int temp = num;
        while(temp>0){
            len+=1;
            temp = temp/10;
        }
        if(len%2 == 0){
            return true;
        }
        return false;
    }
}