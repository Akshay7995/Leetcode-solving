class Solution {
    public int numberOfSubstrings(String s) {
        int[] ans = new int[3];
        int result = 0;
        int starting = 0;
        for(int i=0;i<s.length();i++){
            ans[s.charAt(i)-'a']++;
            while(ans[0]>0 && ans[1]>0 && ans[2]>0){
                result += s.length()-i;
                ans[s.charAt(starting)-'a']--;
                starting++; 
            }
        }
        return result;
    }
}