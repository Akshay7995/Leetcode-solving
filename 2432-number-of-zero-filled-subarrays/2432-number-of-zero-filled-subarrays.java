class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long count = 0;
        int[] temp = new int[nums.length];
        int seq = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                temp[i]=seq+1;
                seq+=1;
            }if(nums[i]!=0){
                seq=0;
            }

        }
        for(int t:temp){
            count +=t;
        }
        return count;
    }
}