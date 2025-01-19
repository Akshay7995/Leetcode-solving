class Solution {
    public int trapRainWater(int[][] heightMap) {
        if(heightMap == null || heightMap.length == 0){
            return 0;
        }
        int m = heightMap.length;
        int n = heightMap[0].length;
        boolean [][] visited = new boolean[m][n];
        PriorityQueue<cell> pq = new PriorityQueue<>((a,b) -> a.height-b.height); 

        for(int i=0;i<m;i++){
            pq.offer(new cell(i,0,heightMap[i][0]));
            pq.offer(new cell(i,n-1,heightMap[i][n-1]));
            visited[i][0] = true;
            visited[i][n-1] = true;
        }
        for(int j=0;j<n;j++){
            pq.offer(new cell(0,j,heightMap[0][j]));
            pq.offer(new cell(m-1,j,heightMap[m-1][j]));
            visited[0][j] = true;
            visited[m-1][j] = true;
        }
        int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
        int trappedwater = 0;
        while(!pq.isEmpty()){
            cell curr = pq.poll();

            for(int[] dir:directions){
                int x = curr.row+dir[0];
                int y = curr.col+dir[1];

                if(x>=0 && x<m && y>=0 && y<n && !visited[x][y]){
                    trappedwater += Math.max(0,curr.height-heightMap[x][y]);

                    pq.offer(new cell(x,y,Math.max(heightMap[x][y],curr.height)));
                    visited[x][y] = true;
                }
            }
        }
        return trappedwater;
    }
}
class cell{
    int row;
    int col;
    int height;
    public cell(int row,int col,int height){
        this.row = row;
        this.col = col;
        this.height = height;
    }
}