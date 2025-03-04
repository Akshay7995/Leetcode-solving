class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> l = new ArrayList<>(hm.entrySet());
        l.sort((a,b)->b.getValue().compareTo(a.getValue()));
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = l.get(i).getKey();
        }
        return ans;
    }
}