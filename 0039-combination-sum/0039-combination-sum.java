class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l1 = new ArrayList<>();
        helper(candidates,target,0,new ArrayList<>(),0,l1);
        return l1;
    }
    void helper(int[] candidates,int target,int index,List<Integer> comb,int total,List<List<Integer>> l1){
        if(total == target){
            l1.add(new ArrayList<>(comb));
            return;
        }
        if(total>target || index >=candidates.length){
            return;
        }
        comb.add(candidates[index]);
        helper(candidates,target,index,comb,total+candidates[index],l1);
        comb.remove(comb.size()-1);
        helper(candidates,target,index+1,comb,total,l1);
    }
}