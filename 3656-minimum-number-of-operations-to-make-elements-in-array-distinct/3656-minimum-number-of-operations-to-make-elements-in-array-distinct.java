class Solution {
    public int minimumOperations(int[] nums) {
        int operators = 0;
        int curr = 0;
        boolean a = true;
        while(a){
            HashSet<Integer> hs = new HashSet<>();
            for(int i=curr;i<nums.length;i++){
                hs.add(nums[i]);
            }
            if(hs.size() == nums.length-curr){
                return operators;
            }
            else {
                curr +=3;
                operators +=1;
            }
            if(curr>=nums.length){
                return operators;
            }
        }
        return operators;
    }
}