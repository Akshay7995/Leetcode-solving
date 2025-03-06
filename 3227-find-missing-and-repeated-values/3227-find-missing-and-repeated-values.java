class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length*grid[0].length;
        HashSet<Integer> hs = new HashSet<>();
        int[] ans = new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(hs.contains(grid[i][j])){
                    ans[0] = grid[i][j];
                }else{
                    hs.add(grid[i][j]);
                }
            }
        }
        for(int i=1;i<=n;i++){
            if(!hs.contains(i)){
                ans[1] = i;
            }
        }
        return ans;
    }
}