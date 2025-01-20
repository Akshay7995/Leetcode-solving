class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        ////No comments//// 
        int m = mat.length;
        int n = mat[0].length;

        int[] row = new int[m];
        int[] col = new int[n];
        HashMap<Integer,int[]> hm = new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                hm.put(mat[i][j],new int[]{i,j});
            }
        }

        for(int i=0;i<arr.length;i++){
            int[] idx = hm.get(arr[i]);
            int r = idx[0];
            int c = idx[1];

            row[r]++;
            col[c]++;

            if(row[r] == n || col[c] == m){
                return i;
            }
        }
        return -1;
    }
}