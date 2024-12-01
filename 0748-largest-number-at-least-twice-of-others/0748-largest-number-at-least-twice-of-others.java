class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i:nums){
            if(i!=max){
                hs.add(i);
            }
        }
        for(int j:hs){
            if(j*2<=max){
                continue;
            }else{
                return -1;
            }
        }
        return index;
    }
}