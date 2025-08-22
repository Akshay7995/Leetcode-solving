class Solution {
    public int minimumArea(int[][] grid) {
        int minrow = grid.length;
        int maxrow = -1;
        int mincol = grid[0].length;
        int maxcol = -1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    minrow = Math.min(minrow,i);
                    maxrow = Math.max(maxrow,i);
                    mincol = Math.min(mincol,j);
                    maxcol = Math.max(maxcol,j);
                }
            }
        }
        if(maxrow == -1){
            return 0;
        }
        return (maxrow-minrow+1)*(maxcol-mincol+1);
    }
}