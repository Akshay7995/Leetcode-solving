class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans = Integer.MIN_VALUE;
        int n = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] - i + n > ans) 
                ans = values[i] - i + n;
            
            if (values[i] + i > n) 
                n = values[i] + i;
        }
        return ans;
    }
}