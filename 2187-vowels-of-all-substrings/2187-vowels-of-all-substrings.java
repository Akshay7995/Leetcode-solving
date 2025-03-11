class Solution {
    public long countVowels(String word) {
        long count = 0;
        String vowels = "aeiou";
        for(int i=0;i<word.length();i++){
            if(vowels.indexOf(word.charAt(i)) != -1){
                count += (long)(word.length()-i)*(long)(i+1);
            }
        }
        return count;
    }
}