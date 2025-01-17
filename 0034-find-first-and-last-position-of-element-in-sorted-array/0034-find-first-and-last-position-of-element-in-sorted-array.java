class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = firstsearch(nums,target);
        ans[1] = secondsearch(nums,target);
        return ans;
    }
    private int firstsearch(int []nums,int target){
        int index = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int middle = start+(end-start)/2;
            if(nums[middle]>=target){
                end = middle-1;
            }else{
                start = middle+1;
            }if(nums[middle]==target){
                index = middle;
            }
        }
        return index;
    }
    private int secondsearch(int []nums,int target){
        int index = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int middle = start+(end-start)/2;
            if(nums[middle]<=target){
                start = middle+1;
            }else{
                end = middle-1;
            }if(nums[middle]==target){
                index = middle;
            }
        }
        return index;
    }
}