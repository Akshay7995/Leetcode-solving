class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        /*boolean[] arr = new boolean[words.length];
        for(int i=0;i<words.length;i++){
            String word = words[i];
            int wordlength = word.length();
            if(hs.contains(word.charAt(0)) && hs.contains(word.charAt(wordlength-1))){
                arr[i] = true;
            }
            else{
                arr[i] = false;
            }
        }
        int[] ans = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int count = 0;
            int start = queries[i][0];
            int end = queries[i][1];
            for(int j=start;j<=end;j++){
                if(arr[j]==true){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;*/
        int n = words.length;
        int[] prefix = new int[n+1];
        for(int i=0;i<n;i++){
            String word = words[i];
            int wordlength = word.length();
            boolean isvowelstring = hs.contains(word.charAt(0)) && hs.contains(word.charAt(wordlength-1));
            prefix[i+1] = prefix[i]+(isvowelstring?1:0);
        }
        int[] ans = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            ans[i] = prefix[end+1]-prefix[start];
        }
        return ans;
    }
}