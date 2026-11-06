class Solution {
    void isl(int i, int j, boolean vis[][], char grid[][], int n, int m){
      if(i < 0 || j < 0 || i >= n || j  >= m || vis[i][j] || grid[i][j] != '1'){
        return;
      }
    vis[i][j] = true;
    isl(i-1, j, vis, grid, n, m); //top
    isl(i, j+1, vis, grid, n, m); //right
    isl(i+1, j, vis, grid, n, m); //bottom
    isl(i, j-1, vis, grid, n, m); //left
    }
    public int numIslands(char[][] grid) {
        int isLands = 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean vis[][] = new boolean[n][m];
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            if(grid[i][j] == '1' &&  !vis[i][j]){
                isl(i, j, vis, grid, n, m);
                isLands++;
            }
        }
    }
    return isLands;
    }
}