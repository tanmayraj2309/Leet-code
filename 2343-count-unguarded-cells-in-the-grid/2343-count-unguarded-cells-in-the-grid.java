class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        
        int grid[][] = new int[m][n];

        //set guards in grid by -1
        for(int[] guard : guards){
            grid[guard[0]][guard[1]] = -1;
        }

        //set walls in grid by 1
        for(int[] wall : walls){
            grid[wall[0]][wall[1]] = 1;
        }


        for(int[] guard : guards){
            makeGuard(grid, guard[0], guard[1]);
        }

        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 0) count++;
            }
        }

        return count;
    }

    private void makeGuard(int[][] grid, int row, int col){

        //Up Direction
        for(int i=row-1; i>=0; i--){
            if(grid[i][col]==1 || grid[i][col] == -1) break;
            grid[i][col] = 2; //mark as visited
        }

        //down direction
        for(int i=row+1; i<grid.length; i++){
            if(grid[i][col]==1 || grid[i][col] == -1) break;
            grid[i][col] = 2; //mark as visited
        }

        //left direction
        for(int i=col-1; i>=0; i--){
            if(grid[row][i] == 1 || grid[row][i] == -1) break;
            grid[row][i] = 2; //mark as visited
        }

        //right direction
        for(int i=col+1; i<grid[0].length; i++){
            if(grid[row][i] == 1 || grid[row][i] == -1) break;
            grid[row][i] = 2; // mark as visited
        }
    }
}