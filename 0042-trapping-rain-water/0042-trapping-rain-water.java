class Solution {
    public int trap(int[] height) {
        /*int n = height.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            int left = 0;
            int right = 0;
            for(int j=0;j<=i;j++){
                left = Math.max(left,height[j]);
            }
            for(int k=i;k<n;k++){
                right = Math.max(right,height[k]);
            }
            ans += Math.min(left,right)-height[i];
        }
        return ans;*/

        if(height == null || height.length ==0){
            return 0;
        }
        int left = 0;
        int right = height.length-1;
        int leftmax = 0;
        int rightmax = 0;
        int ans = 0;
        while(left<right){
            if(height[left]<=height[right]){
                if(height[left] >= leftmax){
                    leftmax = height[left];
                }else{
                    ans += leftmax - height[left];
                }
                left++;
            }
            else{
                if(height[right] >= rightmax){
                    rightmax = height[right];
                }else{
                    ans += rightmax-height[right];
                }
                right--;
            }
        }
        return ans;
    }
}