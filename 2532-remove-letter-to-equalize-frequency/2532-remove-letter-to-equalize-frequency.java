class Solution {
    public boolean equalFrequency(String word) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<word.length();i++){
            hm.put(word.charAt(i),hm.getOrDefault(word.charAt(i),0)+1);
        }
        int[] arr = new int[hm.size()];
        int index = 0;
        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
            arr[index] = entry.getValue();
            index+=1;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]-=1;
            if(helper(arr)){
                return true;
            }
            arr[i]+=1;
        }
        return false;
    }
    private boolean helper(int[] arr){
        int first_non_zero = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                if(first_non_zero==-1){
                    first_non_zero = arr[i];
                }else if(arr[i]!=first_non_zero){
                    return false;
                }
            }
        }
        return true;
    }
}