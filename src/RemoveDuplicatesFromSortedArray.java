import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
	
		int[] arr = {-3,-1,0,0,0,3,3}; //  [[-3,-1,0,3]
		System.out.println(removeDuplicates(arr));
	}
	public static int removeDuplicates(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int v : nums)
			set.add(v);
	
		List<Integer> list = new ArrayList<Integer>(set);
		System.out.println(list);
	    Collections.sort(list);
	    System.out.println(list);
		for(int i = 0; i < nums.length; i++){
            if(i < list.size()){
               nums[i] = list.get(i);  
            }
            else {
            	nums[i] = 0;
            }   
        }
		System.out.println(Arrays.toString(nums));
		return list.size();
    }
}
