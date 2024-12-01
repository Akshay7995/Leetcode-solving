class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }
        if(!hs.contains(original)){
            return original;
        }
        int temp = original*2;
        while(hs.contains(temp)){
            temp = temp*2;
        }
        return temp;
    }
}