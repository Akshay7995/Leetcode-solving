class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        if (dimensions == null || dimensions.length == 0) return 0;

        double maxDiagonal = 0;
        int maxArea = 0;

        for (int[] dim : dimensions) {
            if (dim.length != 2) {
                continue;
            }
            int length = dim[0];
            int width = dim[1];
            double diagonal = Math.sqrt(length * length + width * width);
            int area = length * width;

            if (diagonal > maxDiagonal || (diagonal == maxDiagonal && area > maxArea)) {
                maxDiagonal = diagonal;
                maxArea = area;
            }
        }

        return maxArea;
    }
}