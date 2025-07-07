class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : arr){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int ans = -1;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getKey().equals(entry.getValue())){
                ans = Math.max(ans,entry.getKey());
            }
        }
        return ans;
    }
}