class Solution {
    public int punishmentNumber(int n) {
        int ans = 0;
        for(int i=1;i<=n;i++){
            int new_num = i*i;
            if(helper(Integer.toString(new_num),0,i)){
                ans += new_num;
            }
        }
        return ans;
    }
    private boolean helper(String s,int index,int target){
        if(index == s.length()){
            return target==0;
        }
        int sum = 0;

        for(int j=index;j<s.length();j++){
            sum = sum*10+(s.charAt(j)-'0');

            if(sum>target){
                return false;
            }
            if(helper(s,j+1,target-sum)){
                return true;
            }
        }
        return false;
    }
}