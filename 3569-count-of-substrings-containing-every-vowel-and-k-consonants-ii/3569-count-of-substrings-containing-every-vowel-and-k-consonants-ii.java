class Solution {
    public long countOfSubstrings(String word, int k) {
        return atleast(word,k)-atleast(word,k+1);
    }
    private long atleast(String word,int k){
        long ans = 0;
        String vowels = "aeiou";
        int left = 0;
        int consount = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int right=0;right<word.length();right++){
            char ch = word.charAt(right);
            if(vowels.indexOf(ch) != -1){
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }else{
                consount+=1;
            }

            while(consount >= k && hm.size()==5 ){
                ans += (word.length()-right);
                char left_char = word.charAt(left);
                if(vowels.indexOf(left_char)!=-1){
                    hm.put(left_char,hm.get(left_char)-1);
                    if(hm.get(left_char)==0){
                        hm.remove(left_char);
                    }
                }else{
                    consount--;
                }
                left++;
            }
            /*if(consount==k && hm.size()==5){
                ans += (right - left + 1);
            }*/
        }
        return ans;
    }
}