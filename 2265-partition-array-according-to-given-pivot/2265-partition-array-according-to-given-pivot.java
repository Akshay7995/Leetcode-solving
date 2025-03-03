class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        int index = 0;
        for(int num : nums){
            if(num>pivot){
                l1.add(num);
            }else if(num==pivot){
                l2.add(num);
            }
            else{
                ans[index] = num;
                index++;
            }
        }
        if(l2.size()!=0){
            for(int j=0;j<l2.size();j++){
                ans[index] = l2.get(j);
                index++;
            }
        }
        for(int i=0;i<l1.size();i++){
            ans[index] = l1.get(i);
            index++;
        }
        return ans;
    }
}