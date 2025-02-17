class Solution {
    public int numTilePossibilities(String tiles) {
        int[] count = new int[26];
        for(char ch : tiles.toCharArray()){
            count[ch-'A']++;
        }
        return helper(count);
    }
    private int helper(int[] count){
        int sum = 0;
        for(int i=0;i<26;i++){
            if(count[i]>0){
                sum+=1;
                count[i]--;
                sum += helper(count);
                count[i]++;
            }
        }
        return sum;
    }
}