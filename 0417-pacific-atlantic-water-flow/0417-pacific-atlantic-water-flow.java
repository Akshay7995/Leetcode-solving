class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> l = new ArrayList<>();
        int rows = heights.length;
        int cols = heights[0].length;

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        // for pacific ocean
        for(int i=0;i<rows;i++){
            dfs(heights,pacific,i,0,heights[i][0]);
        }
        for(int j=0;j<cols;j++){
            dfs(heights,pacific,0,j,heights[0][j]);
        }

        // for atlantic ocean
        for(int i=0;i<rows;i++){
            dfs(heights,atlantic,i,cols-1,heights[i][cols-1]);
        }
        for(int j=0;j<cols;j++){
            dfs(heights,atlantic,rows-1,j,heights[rows-1][j]);
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    l.add(Arrays.asList(i,j));
                }
            }
        }
        return l;
    }
    public void dfs(int[][] heights,boolean[][] visited,int r,int c,int prevheight){
        int rows = heights.length;
        int cols = heights[0].length;

        if(r<0 || c<0 || r>=rows || c>=cols || visited[r][c] || heights[r][c] < prevheight){
            return;
        }
        visited[r][c] = true;
        dfs(heights,visited,r+1,c,heights[r][c]);
        dfs(heights,visited,r,c+1,heights[r][c]);
        dfs(heights,visited,r-1,c,heights[r][c]);
        dfs(heights,visited,r,c-1,heights[r][c]);

    }
}