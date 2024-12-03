class Solution {
    public String addSpaces(String s, int[] spaces) {
        HashSet<Integer> hs = new HashSet<>();
        for(int nums:spaces){
            hs.add(nums);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(hs.contains(i)){
                sb.append(" ");
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}