class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = 0;
        long new_num = 0;
        if(nums.length<3){
            return 0;
        }
        for(int i=0;i<=nums.length-3;i++){
            for(int j=i+1;j<=nums.length-2;j++){
                for(int k=j+1;k<=nums.length-1;k++){
                    new_num = (long)(nums[i]-nums[j])*nums[k];
                    if(max < new_num){
                        max = new_num;
                    }
                }
            }
        }
        return max;
    }
}