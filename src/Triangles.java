import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Triangles {

	public static void main(String[] args) {
		List<List<Integer>> triangle = new ArrayList();
		triangle.add(Arrays.asList(2));   //2
		triangle.add(Arrays.asList(3,4));  //5  6
		triangle.add(Arrays.asList(6,5,7)); //11 10 13
		triangle.add(Arrays.asList(4,1,8,3)); //15 11 18 16
		System.out.println(minimumTotal2(triangle));

	}

	//time complexity : o(n^2)
	//space complexity : o(1)
	//top to bottom approach
	 public static int minimumTotal(List<List<Integer>> triangle) {
		 for(int i = 1; i < triangle.size(); i++) {
			 for(int j = 0; j < triangle.get(i).size(); j++) {
				 int sum = 0;
				 if( j == 0) {
					 sum = triangle.get(i).get(j) + triangle.get(i-1).get(j);
				 }
				 else if(j == triangle.get(i).size()-1) {
					 sum = triangle.get(i).get(j) + triangle.get(i-1).get(triangle.get(i-1).size()-1);
				 }
				 else {
					 int min = Math.min(triangle.get(i-1).get(j), triangle.get(i-1).get(j-1));
					 sum = min + triangle.get(i).get(j);
				 }
				 triangle.get(i).set(j, sum);
			 }
		 }
		 return Collections.min(triangle.get(triangle.size()-1));
	 }
	 
	//time complexity : o(n^2)
	//space complexity : o(1)
	//bottom to top approach
	 public static int minimumTotal1(List<List<Integer>> triangle) {
		for( int i = triangle.size()-2; i >= 0; i--) {
			for(int j = 0; j < triangle.get(i).size(); j++) {
				int min = Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1));
				int sum = min + triangle.get(i).get(j);
				triangle.get(i).set(j, sum);
			}
		}
		 return triangle.get(0).get(0);
	 }	 
	 
	 //without changing original array
	 public static int minimumTotal2(List<List<Integer>> triangle) {
	        int[] dp = new int[triangle.size()+1];
	        for(int i = triangle.size()-1;i>=0; i--){
	            for(int j=0; j < triangle.get(i).size(); j++){
	                int curr = triangle.get(i).get(j);
	                dp[j] = curr + Math.min(dp[j] , dp[j+1]);
	            }
	        }
	        return dp[0];
	    }
}
