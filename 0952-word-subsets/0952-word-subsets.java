class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxfreq = new int[26];
        int[] tempfreq = new int[26];
        for(String word:words2){
            Arrays.fill(tempfreq,0);
            for(char ch:word.toCharArray()){
                tempfreq[ch-'a']++;
            }
            for(int i=0;i<26;i++){
                maxfreq[i] = Math.max(maxfreq[i],tempfreq[i]);
            }
        }

        List<String> l = new ArrayList<>();
        for(String word:words1){
            Arrays.fill(tempfreq,0);
            for(char ch:word.toCharArray()){
                tempfreq[ch-'a']++;
            }
            boolean is_universal = true;
            for(int i=0;i<26;i++){
                if(maxfreq[i]>tempfreq[i]){
                    is_universal = false;
                    break;
                }
            }
            if(is_universal==true){
                l.add(word);
            }
        }
        return l;
    }
}