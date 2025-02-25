class Solution {
    public int numOfSubarrays(int[] arr) {
        int oddcount = 0;
        int evencount = 1;
        int sum = 0;
        int ans = 0;
        int MOD = 1_000_000_007;

        for(int num : arr){
            sum += num;
            if(sum%2 == 0){
                ans = (ans+oddcount)%MOD;
                evencount++;
            }else{
                ans = (ans+evencount)%MOD;
                oddcount++;
            }
        }
        return ans;
    }
}