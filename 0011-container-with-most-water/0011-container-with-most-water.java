class Solution {
    public int maxArea(int[] height) {
        int p1 = 0;
        int p2 = height.length-1;
        int max = Integer.MIN_VALUE;
        while(p1<p2){
            int n1 = height[p1];
            int n2 = height[p2];
            int dis = p2-p1;
            int area = (dis)*(Math.min(n1,n2));
            if(area>max){
                max = area;
            }
            if(height[p1]<height[p2]){
                p1++;
            }else{
                p2--;
            }
        }
        return max;
    }
}