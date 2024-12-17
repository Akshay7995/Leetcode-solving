class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        PriorityQueue<Character> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                q.offer((char)(i+'a'));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()){
            char curr = q.poll();
            int count = Math.min(freq[curr-'a'],repeatLimit);
            for(int i=0;i<count;i++){
                sb.append(curr);
            }
            freq[curr-'a'] -=count;
            if(freq[curr-'a']>0){
                if(q.isEmpty()){
                    break;
                }
                char next = q.poll();
                sb.append(next);
                freq[next-'a']--;
                if(freq[next-'a']>0){
                    q.offer(next);
                }
                q.offer(curr);
            }
        }
        return sb.toString();
    }
}