class Solution {
    public int maxScore(String s) {
        int total_ones = 0;
        int ones = 0;
        int zeros = 0;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)=='1'){
                total_ones++;
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                zeros++;
            }
            else{
                ones++;
            }
            int curr_ans = zeros+(total_ones-ones);
            ans = Math.max(curr_ans,ans);
        }
        return ans;
    }
}