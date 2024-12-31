class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int maximumday = days[days.length-1];
        boolean[] travelled_day = new boolean[maximumday+1];
        for(int day : days){
            travelled_day[day] = true;
        }
        int[] dp = new int[maximumday+1];
        dp[0] = 0;
        for(int i=1;i<=maximumday;i++){
            if(!travelled_day[i]){
                dp[i] = dp[i-1];
                continue;
            }
            dp[i] = costs[0]+dp[i-1];
            dp[i] = Math.min(dp[Math.max(0,i-7)]+costs[1],dp[i]);
            dp[i] = Math.min(dp[Math.max(0,i-30)]+costs[2],dp[i]);
        }
        return dp[maximumday];
    }
}