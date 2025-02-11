package com.leetcode;




public class _200_Number_of_Islands {

//	Runtime: 1 ms, faster than 100.00% of Java online submissions for Number of Islands.
//	Memory Usage: 41.1 MB, less than 66.98% of Java online submissions for Number of Islands.
    public int numIslands(char[][] grid) {
    
    	int island = 0;
    	
    	if(grid== null) return island;
    	
    	for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				
				//is a island
				if(grid[i][j] == '1') {
					dfs(grid,i,j);
					island++;
				}
				
			}
		}
    	
    	
    	return island;
    }
    
    public void dfs(char[][] grid, int x, int y) {
    	
    	if(x>=0 && x<grid.length && y>=0 && y <grid[x].length && grid[x][y]== '1' ) {
    		grid[x][y] = '0';
    		dfs(grid,x+1,y);
    		dfs(grid,x-1,y);
    		dfs(grid,x,y+1);
    		dfs(grid,x,y-1);
    	}
    	
    }

}
