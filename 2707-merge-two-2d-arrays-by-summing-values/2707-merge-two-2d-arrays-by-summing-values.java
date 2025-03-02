class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int[] num : nums1){
            hm.put(num[0],num[1]);
        }
        for(int[] num : nums2){
            hm.put(num[0],hm.getOrDefault(num[0],0)+num[1]);
        }
        int[][] ans = new int[hm.size()][2];
        int index = 0;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            ans[index][0] = entry.getKey();
            ans[index][1] = entry.getValue();
            index++;
        }
        Arrays.sort(ans, Comparator.comparingInt(a -> a[0]));
        return ans;
    }
}