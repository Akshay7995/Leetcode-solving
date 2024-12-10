class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        int maxlen = -1;
        HashMap<String,Integer> hm = new HashMap<>();
        for(int len=n;len>0;len--){
            for(int i=0;i<=n-len;i++){
                String substring = s.substring(i,i+len);
                if(helper(substring)){
                    hm.put(substring,hm.getOrDefault(substring,0)+1);
                    if(hm.get(substring)>=3){
                        return len;
                    }
                }
            }
        }
        return maxlen;
    }
    boolean helper(String s){
        char ch = s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(ch!=s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}