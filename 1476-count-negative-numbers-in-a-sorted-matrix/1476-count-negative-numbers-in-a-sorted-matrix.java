class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                if(grid[row][col]<0){
                    ans+=1;
                }
            }
        }
        return ans;
    }
}