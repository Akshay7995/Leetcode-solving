class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        int ans = sum;
        int j = cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            sum = sum-cardPoints[i];
            sum = sum+cardPoints[j];
            j--;
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}