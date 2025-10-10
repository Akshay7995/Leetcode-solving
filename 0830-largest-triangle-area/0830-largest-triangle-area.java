class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double ans = 0.0;
        for(int i=0;i<n;i++){
            double x1 = points[i][0];
            double y1 = points[i][1];
            for(int j =i+1;j<n;j++){
                double x2 = points[j][0];
                double y2 = points[j][1];
                for(int k=j+1;k<n;k++){
                    double x3 = points[k][0];
                    double y3 = points[k][1];

                    double area = Math.abs((0.5)*(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)));
                    ans = Math.max(area,ans);
                }
            }
        }
        return ans;
    }
}