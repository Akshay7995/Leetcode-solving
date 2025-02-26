class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum = 0;
        int maxsum = 0;
        int minsum = 0;
        for(int num : nums){
            sum += num; // 0 1 -2 0 3 -1
            if(sum>maxsum){ // 0 1 1 1 3 3 
                maxsum = sum;
            }
            if(sum<minsum){ // 0 0 -2 -2 -2 -2
                minsum = sum;
            }
        }
        return Math.abs(maxsum-minsum);
    }
}