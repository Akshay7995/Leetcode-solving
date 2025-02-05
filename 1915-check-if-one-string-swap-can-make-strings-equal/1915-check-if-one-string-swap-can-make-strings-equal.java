class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char w : s1.toCharArray()){
            hm.put(w,hm.getOrDefault(w,0)+1);
        }

        HashMap<Character,Integer> hm2 = new HashMap<>();
        for(char w2 : s2.toCharArray()){
            hm2.put(w2,hm2.getOrDefault(w2,0)+1);
        }
        boolean ans = hm.entrySet().equals(hm2.entrySet());
        if(ans == false){
            return false;
        }
        
        int count = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count+=1;
            }
        }
        if(count==0 || count==2){
            return true;
        }
        return  false;
    }
}