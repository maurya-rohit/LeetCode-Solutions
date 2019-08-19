class Solution {
    public int numIslands(char[][] grid) {
        int len=grid.length;
        int answer=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<grid[0].length;j++){
               if(grid[i][j]=='1'){
                   answer++;
                   removeAdjacent(grid,i,j);
               }
        }
    }
        return answer;
}
    public void removeAdjacent(char[][] grid, int i ,int j){
        if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]=='1'){
            grid[i][j]='0';
            removeAdjacent(grid,i+1,j);
            removeAdjacent(grid,i-1,j);
            removeAdjacent(grid,i,j+1);
            removeAdjacent(grid,i,j-1);
        }
    }
}
