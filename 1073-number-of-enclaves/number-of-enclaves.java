class Solution {
    int n;
    int m;
    public int numEnclaves(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        for(int i=0; i<n; i++){
            if(grid[i][0]==1){
                dfs(grid, i, 0);
            }
            if(grid[i][m-1]==1){
                dfs(grid, i, m-1);
            }
        }
        for(int j=0; j<m; j++){
            if(grid[0][j]==1){
                dfs(grid, 0, j);
            }
            if(grid[n-1][j]==1){
                dfs(grid, n-1, j);
            }
        }
        int count=0;
        for(int r=0; r<n; r++){
            for(int c=0; c<m; c++){
                if(grid[r][c]==1){
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int[][] grid, int i, int j){
        if(i<0 || i>n-1 || j<0 || j>m-1 || grid[i][j]==0){
            return;
        }
        grid[i][j]=0;
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);
        dfs(grid, i+1, j);
        dfs(grid, i, j+1);
    }
}