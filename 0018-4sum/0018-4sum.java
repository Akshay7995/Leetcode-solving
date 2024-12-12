class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int left = j+1;
                int right = nums.length-1;
                while(left<right){
                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum == target){
                        List<Integer> l2 = new ArrayList<>();
                        l2.add(nums[i]);
                        l2.add(nums[j]);
                        l2.add(nums[left]);
                        l2.add(nums[right]);
                        if(!hs.contains(l2)){
                            hs.add(l2);
                        }
                        left++;
                        right--;
                    }
                    else if(sum<=target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        l.addAll(hs);
        return l;
    }
}