class Solution {
    public int deleteAndEarn(int[] nums) {
        int maxnum = 0;
        for(int num:nums){
            maxnum = Math.max(maxnum,num);
        }
        int[] points = new int[maxnum+1];
        for(int num:nums){
            points[num] +=num;
        }
        int[] dp = new int[maxnum+1];
        dp[0] = 0;
        dp[1] = points[1];
        for(int i=2;i<=maxnum;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+points[i]);
        }
        return dp[maxnum];
    }
}