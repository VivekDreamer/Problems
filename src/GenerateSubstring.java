import java.util.ArrayList;
import java.util.List;

public class GenerateSubstring {

	public static void main(String[] args) {
		int nums[] = {1 ,2, 3};
//		List<List<Integer>> subsets = subsets(nums);
//		System.out.println(subsets);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
	    generate(0 , nums , new ArrayList(), result);	

		
	}
	
	private static void generate(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
		result.add(new ArrayList<Integer>(current));
		System.out.println(result);
		for(int i = index;i< nums.length;i++) {
			current.add(nums[i]);
			System.out.println(result+" before");	
			generate(i+1,nums,current,result);
			System.out.println(result+" after");
			current.remove(current.size()-1);
		}
	
	}

	//iterative approach
	public static List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> result = new ArrayList<>(); //we'll keep our powerset in this
		result.add(new ArrayList<Integer>());
		
		for( int num : nums) {	
			int n = result.size();
			for( int j = 0; j < n; j++ ) {
				List<Integer> temp = new ArrayList(result.get(j)); //copy the list
				temp.add(num); //add number
				result.add(temp);//add that list into result
			}
		}
		return result;
	}
	
	

}
