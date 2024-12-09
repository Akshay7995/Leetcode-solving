class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int[] arr = new int[nums.length];
        boolean ans[] = new boolean[queries.length];

        int c = 0;
        arr[0] = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]%2==0 && nums[i]%2==0 || nums[i-1]%2==1 && nums[i]%2==1){
                c++;
            }
            arr[i] = c;
        }
        for(int i=0;i<queries.length;i++){
            int m = queries[i][0];
            int n = queries[i][1];
            if(arr[n]-arr[m]==0){
                ans[i]=true;
            }
            else{
                ans[i]=false;
            }
        }
        return ans;
    }
}