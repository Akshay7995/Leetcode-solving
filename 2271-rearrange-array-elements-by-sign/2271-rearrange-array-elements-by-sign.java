class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();
        int[] ans = new int[nums.length];
        for(int num : nums){
            if(num > 0){
                p.add(num);
            }
            if(num < 0){
                n.add(num);
            }
        }
        int index = 0;
        int PosInd = 0;
        int NegInd = 0;
        while(PosInd < p.size() && NegInd < n.size()){
            ans[index++] = p.get(PosInd++);
            ans[index++] = n.get(NegInd++);
        }
        while(PosInd < p.size()){
            ans[index++] = p.get(PosInd);
        }
        while(NegInd < n.size()){
            ans[index++] = n.get(NegInd++);
        }
        return ans;
    }
}