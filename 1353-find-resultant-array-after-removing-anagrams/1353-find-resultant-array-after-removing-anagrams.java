class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> l = new ArrayList<>();
        if(words.length == 0 || words == null){
            return null;
        }
        l.add(words[0]);
        HashMap<Character,Integer> hm1 = helper(words[0]);
        for(int i=1;i<words.length;i++){
            HashMap<Character,Integer> hm2 = helper(words[i]);
            if(!hm1.equals(hm2)){
                l.add(words[i]);
                hm1 = hm2;
            }
        }
        return l;
    }
    public HashMap<Character,Integer> helper(String word){
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char ch:word.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        return freq;
    }
}