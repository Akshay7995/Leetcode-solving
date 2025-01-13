class Solution {
    public int minimumLength(String s) {
        int[] arr = new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            while(arr[i]>=3){
                arr[i] -=2;
            }
        }
        int ans = 0;
        for(int i=0;i<26;i++){
            ans +=arr[i];
        }
        return ans;
    }
}