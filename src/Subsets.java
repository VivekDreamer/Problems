
import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		List<List<Integer>> big = new ArrayList<List<Integer>>();
		subset(arr, 0, new ArrayList<Integer>(), big);
		System.out.println(big);
		//	subset(arr, 0, "");

	}
	public static void subset(int[] arr, int vidx, String answer) {
		
		//where we have to stop
		if(vidx == arr.length) {
			System.out.println(answer);
			return;
		}	
		subset(arr, vidx+1, answer + arr[vidx]); //include call
		subset(arr, vidx+1, answer);             //exclude call
	}
	
	public static void subset(int[] arr, int vidx, List<Integer> temp, List<List<Integer>> big) {
		
		if(vidx == arr.length) {
			big.add(new ArrayList<Integer>(temp));
			return;
		}
		
		temp.add(arr[vidx]);             //adding in temp arraylist
		subset(arr, vidx+1 , temp, big); //include call
		temp.remove(temp.size()-1);      //changes undo
		
		subset(arr, vidx+1, temp, big);  //exclude call
		
	}

}
