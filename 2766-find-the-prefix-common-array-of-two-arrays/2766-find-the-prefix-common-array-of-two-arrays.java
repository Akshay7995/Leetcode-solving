class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] freq = new int[n+1];
        int[] ans = new int[n];
        int temp = 0;
        for(int i=0;i<n;i++){
            freq[A[i]-1]++;
            if(freq[A[i]-1] == 2){
                temp++;
            }
            freq[B[i]-1]++;
            if(freq[B[i]-1] == 2){
                temp++;
            }
            ans[i] = temp;
        }
        return ans;
    }
}