import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		boolean[] flag = new boolean[nums.length];
//		permute(nums, "", flag);
		
//		List<Integer> current = new ArrayList<Integer>();
		List<List<Integer>> big = new ArrayList<List<Integer>>();
//		permute(nums, current, big, flag);
//		System.out.println(big);
		
		permuteApproach2(0, nums, big);
		System.out.println(big);
	}
	
	public static void permute(int[] nums, String ans, boolean[] flag) {
		if(ans.length() == nums.length) {
			System.out.println(ans);
			return;
		}
		else {
			for(int i = 0;i < nums.length;i++) {
				if(!flag[i]) {
					System.out.println(ans);
					flag[i] = true;
					ans=ans.concat(String.valueOf(nums[i]));
					System.out.println("answer "+ans+" "+i);
					permute(nums, ans, flag);
					ans=ans.substring(0, ans.length()-1);
					System.out.println("answer2 "+ans+" "+i);
					flag[i] = false;
				}
			}
		}
	}
	
	public static void permute(int[] nums, List<Integer> current, List<List<Integer>> big, boolean[] freq) {
		if(nums.length == current.size()) {
			big.add(new ArrayList<Integer>(current));
			return;
		}
		for(int i = 0; i< nums.length; i++) {
			if(!freq[i]) {
				freq[i] = true;
				current.add(nums[i]);
				permute(nums, current, big, freq);
				current.remove(current.size()-1);
				freq[i] = false;
			}
		}
	}
	
	public static void permuteApproach2(int index, int[] nums, List<List<Integer>> ans) {
		if( index == nums.length) {
			List<Integer> current = new ArrayList<Integer>();
			for( int i = 0; i< nums.length; i++) {
				current.add(nums[i]);
			}
			ans.add(new ArrayList<Integer>(current));
			return;
		}
		for( int i = index; i< nums.length ; i++) {
			swap(i, index, nums);
			permuteApproach2(index+1, nums, ans);
			swap(i, index, nums);
		}
	}
	
	private static void swap(int i, int j , int[] nums) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}

}
