class Solution {
    private String ans = "";
    public String getHappyString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        char[] letters = {'a','b','c'};
        helper(0,n,letters,sb,new int[]{k});
        return ans;
    }
    private void helper(int length,int n,char[] chars,StringBuilder sb,int[] count){
        if(length == n){
            if(--count[0] == 0){
                ans = sb.toString();
            }
            return;
        }
        for(char c: chars){
            if(length ==0 || sb.charAt(length-1) != c){
                sb.append(c);
                helper(length+1,n,chars,sb,count);
                sb.deleteCharAt(sb.length()-1);
                if(count[0]==0){
                    return;
                }
            }
        }
    }
}