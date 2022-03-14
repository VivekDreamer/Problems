import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {

	public static void main(String[] args) {
		int[] arr = {1,1,2};
//		subset(arr, 0, "", true);
		Arrays.sort(arr);
		List<List<Integer>> big = new ArrayList<List<Integer>>();
        subset(arr, 0, big, new ArrayList<Integer>(), true);
        System.out.println(big);

	}
	public static void subset(int[] arr, int vidx, String answer, boolean flag) {
		
		//where we have to stop
		if(vidx == arr.length) {
			System.out.println(answer);
			return;
		}	
		if(flag == false && arr[vidx] == arr[vidx-1]) {
			subset(arr, vidx+1, answer , false);             //exclude call
		}
		else {
			subset(arr, vidx+1, answer + arr[vidx], true);  //include call
			subset(arr, vidx+1, answer , false);             //exclude call
		}
	}
	public static void subset(int[] arr, int vidx, List<List<Integer>> big, List<Integer> temp,boolean flag) {
		
		//where we have to stop
		if(vidx == arr.length) {
			big.add(new ArrayList<Integer>(temp));
			return;
		}	
		if(flag == false && arr[vidx] == arr[vidx-1]) {
			subset(arr, vidx+1,big,temp,false);             //exclude call
		}
		else {
			temp.add(arr[vidx]);
			subset(arr, vidx+1,big,temp,true);              //include call
			temp.remove(temp.size()-1);
			subset(arr, vidx+1,big,temp,false);             //exclude call
		}
	}
}
