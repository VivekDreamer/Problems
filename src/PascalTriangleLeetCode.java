import java.util.ArrayList;
import java.util.List;

public class PascalTriangleLeetCode {

	public static void main(String[] args) {
		generate(5);
	}
	public static List<List<Integer>> generate(int numRows) {
	        
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> firstRow = new ArrayList<Integer>();
		firstRow.add(1);
		ans.add(firstRow);
		
		for(int i = 1; i < numRows; i++) {
			List<Integer> previousRow = ans.get(i-1);
			List<Integer> currentRow = new ArrayList<Integer>();
			currentRow.add(1);
			for(int j = 1; j < i; j++) {
				currentRow.add(previousRow.get(j-1) + previousRow.get(j));
			}
			currentRow.add(1);	
			ans.add(currentRow);
			System.out.println(ans);
		}
		return ans;
	}
}
