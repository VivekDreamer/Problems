import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		int n = 4;
		int k = 2;
//		combinations(arr,n, "", 0);
		List<List<Integer>> big = new ArrayList<List<Integer>>();
		combinations(n, k, big, new ArrayList<Integer>(), 1);
		System.out.println(big);
	}
	
	public static void combinations(int[] arr,int n, String ans, int vidx) {
		if(ans.length() == n) {
			System.out.println(ans);
			return;
		}
		if(vidx == arr.length)
			return;
		 combinations(arr, n, ans+arr[vidx], vidx+1);  //include
		 combinations(arr, n, ans, vidx+1);            //exclude	
	}
	
	public static void combinations(int n, int k, List<List<Integer>> big, List<Integer> current, int start) {	
		if(current.size() == k) {
			big.add(new ArrayList<Integer>(current));
			return;
		}
		for(int i = start; i <= n; i++) {
			current.add(i);
			combinations(n, k, big, current, i+1);
			current.remove(current.size()-1);
		}
	}
}
