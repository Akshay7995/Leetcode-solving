class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while(sb.length() < k){
            int len = sb.length();
            for(int i=0;i<len;i++){
                char ch = sb.charAt(i);
                char next = (ch == 'z') ? 'a' :(char)(ch+1);
                sb.append(next);
            }
        }
        return sb.charAt(k-1);
    }
}