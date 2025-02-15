class Solution {
    public int[] twoSum(int[] nums, int target) {
        //ArrayList<Integer> l = new ArrayList<>(2);
        int a = 0;
        int b = 0;
        for(int i=0;i<=nums.length-2;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[i]+nums[j] == target){
                    /*l[0] = nums[i];
                    l[1] = nums[j];*/
                    a = i;
                    b = j;
                }
            }
        }
        //return l;
        return new int[]{a,b};
    }
}