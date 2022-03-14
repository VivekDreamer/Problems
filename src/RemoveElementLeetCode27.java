import java.util.Arrays;


public class RemoveElementLeetCode27 {
	public static void main(String[] args) {	
		System.out.println(removeElement(new int[] {3,2,2,3}, 3));
	}
	 public static int removeElement(int[] nums, int val) {
		int count = 0;
		int ans = 0;
		int[] arr = new int[nums.length];
		for(int i = 0; i < arr.length; i++) {
			if(nums[i] != val) {
				arr[count] = nums[i];
				count++;
				ans++;
			}
			System.out.println(Arrays.toString(arr));		
		}
		for(int i = 0; i < nums.length; i++) 
			nums[i] = arr[i];
			
		System.out.println(Arrays.toString(nums));
		return ans;
	 }
}
