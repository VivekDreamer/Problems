
public class Solution5 {
	public static void main(String[] args) {

		int nums[] = { 1, 3, 5, 6 };
		int target = 8;
		System.out.println(searchInsert(nums, target));

	}

	private static int searchInsert(int[] nums, int target) {
		// binary search
		int low = 0;
		int high = nums.length - 1;
		int mid = 0;
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] < target)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return low;
	}
}
