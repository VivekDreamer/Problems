import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
	public static void main(String[] args) {
	 int[][] grid = {{1,2,1},
			         {1,1,2},
			         {0,2,1}};
	 Queue<int[]> rottenCordinates = new LinkedList();
	 int row = grid.length;
     int column = grid[0].length;
    System.out.println("row : "+row);
    System.out.println("column : "+column);
     int freshOranges = 0;
     int time = 0;
     for( int i = 0; i < row; i++){
       for(int j = 0; j < column; j++){
           if(grid[i][j] == 2)
               rottenCordinates.add(new int[]{i,j});
           else if(grid[i][j] == 1)
               freshOranges+=1;
       }
      }
     
     while(!rottenCordinates.isEmpty()){
       int num = rottenCordinates.size();
       for( int i = 0;i < num; i++){
           int x = rottenCordinates.peek()[0];
           int y = rottenCordinates.peek()[1];
           System.out.println("x : "+x);
           System.out.println("y : "+y);
           System.out.println("________________________________________________________________");
           rottenCordinates.remove();
           if(x>0 && grid[x-1][y]==1){
               grid[x-1][y]=2;
               freshOranges--;
               rottenCordinates.add(new int[]{x-1,y});
           }
           if(y>0 && grid[x][y-1]==1){
               grid[x][y-1]=2;
               freshOranges--;
               rottenCordinates.add(new int[]{x,y-1});
           }
           if(x < row-1 && grid[x+1][y]==1){
               grid[x+1][y]=2;
               freshOranges--;
               rottenCordinates.add(new int[]{x+1,y});
           }
           if(y < column-1 && grid[x][y+1]==1){
               grid[x][y+1]=2;
               freshOranges--;
               rottenCordinates.add(new int[]{x,y+1});
               }
       }
       if(!rottenCordinates.isEmpty())time++;
   }
//   return (freshOranges == 0) ? time : -1;
     if(freshOranges == 0)
    	 System.out.println("time : "+ time);
     else
    	 System.out.println("-1");
	}
}

