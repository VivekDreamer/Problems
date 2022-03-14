
public class WordSearch {
	static boolean[][] visited;
	public static void main(String[] args) {
		char[][] board = {{'A','B','C','E'},
				          {'S','F','C','S'},
				          {'A','D','E','E'}};
		String word = "ASF";
		visited = new boolean[board.length][board[0].length];
		System.out.println(exist(board, word, visited));
	}
	public static boolean exist(char[][] board, String word,boolean[][] visited) {
		
		
		for( int i = 0; i < board.length; i++) {
			for( int j = 0; j < board[0].length; j++) {
				if((board[i][j] == word.charAt(0)) && wordSearch(i , j , 0, word, board)) {
					return true;
				}
			}
		}
		
		return false;
    }
	private static boolean wordSearch(int i, int j, int index, String word, char[][] board) {
	    if(word.length() == index)return true;
	    
	    if( i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j] || word.charAt(index) != board[i][j])
	    	return false;
		
		visited[i][j] = true;
	    if(wordSearch(i-1, j, index+1, word, board) || wordSearch(i+1, j, index+1, word, board) || wordSearch(i, j-1, index+1, word, board) || wordSearch(i, j+1, index+1, word, board)) return true;
	    visited[i][j] = false;
	    
		return false;
	}
	
	
//	private static boolean wordSearch(int row, int col ,char[][] board, String word, String ans, boolean[][] visited) {
//		
//		if(word == ans) {
//			System.out.println(true);
//		}
//		
//		if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || visited[row][col])
//			return ;
//		visited[row][col] = true;
//		wordSearch(row-1,col,board,word,ans+String.valueOf(board[row][col]),visited);
//		wordSearch(row+1,col,board,word,ans+String.valueOf(board[row][col]),visited);
//		wordSearch(row,col-1,board,word,ans+String.valueOf(board[row][col]),visited);
//		wordSearch(row,col+1,board,word,ans+String.valueOf(board[row][col]),visited);
//		visited[row][col] = false;
//	
//	}

}
