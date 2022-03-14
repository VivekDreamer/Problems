
public class BlockedMaze {

	public static void main(String[] args) {
		int[][] grid = {{0,1,0,0},
				        {0,0,0,0},
				        {0,1,0,0},
				        {0,1,1,0}};
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		maze(grid, 0, 0, "",visited);
	}
	public static void maze(int grid[][],int row, int col, String ans, boolean[][] visited) {
		
		if(row == grid.length-1 && col == grid[0].length-1) {
			System.out.println(ans);
			return;
		}
		
		//base condition
		if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || visited[row][col] || grid[row][col]==1)
			return;
		
		//this is to prevent from going into stackoverflow error
		visited[row][col] = true;
		
		maze(grid,row-1,col,ans+"T",visited); //call to top
		maze(grid,row+1,col,ans+"D",visited); //call to down
		maze(grid,row,col-1,ans+"L",visited); //call to left
		maze(grid,row,col+1,ans+"R",visited); //call to right
		
		//and when you are returning after doing all calls, simply undo the changes you have done
		visited[row][col] = false;
	}

}
