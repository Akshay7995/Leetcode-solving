class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                ans[i] = prices[i];
                if(prices[j]<=prices[i]){
                    ans[i] = prices[i]-prices[j];
                    break;
                }
            }
        }
        ans[prices.length-1] = prices[prices.length-1];
        return ans;
    }
}