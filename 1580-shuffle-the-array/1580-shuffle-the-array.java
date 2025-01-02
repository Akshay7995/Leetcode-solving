class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int leftPointer = 0;  
        int rightPointer = n; 
        int index = 0;        
        
        while (leftPointer < n) {
            ans[index] = nums[leftPointer]; 
            index++;
            leftPointer++;  
            ans[index] = nums[rightPointer];
            index++;
            rightPointer++;
        }
        return ans;
    }
}
