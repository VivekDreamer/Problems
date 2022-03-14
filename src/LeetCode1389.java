import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1389 {

	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1};
		System.out.println(Arrays.toString(createTargetArray1(nums, index)));
	}
	public static int[] createTargetArray(int[] nums, int[] index) {
      
		int j = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i : index)
			list.add(i, nums[j++]);
		int[] result = new int[nums.length];
		for(int k = 0;k < list.size(); k++)
			result[k] = list.get(k);
		return result;
    }
	
//logic 2	
	public static int[] createTargetArray1(int[] nums, int[] index) {
//		int[] nums = {0,1,2,3,4};
//		int[] index = {0,1,2,2,1};
		int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            insertAndShift(target, index[i], nums[i]);
        }
        return target;
    }
    
    private static void insertAndShift(int[] arr, int idx, int val) {
        int v = val;
        for (int i = idx; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = v;
            v = temp;
        }
    }
}


