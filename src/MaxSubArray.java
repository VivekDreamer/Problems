
public class MaxSubArray {

	public static void main(String[] args) {
		int[] nums = {-1,-2};
		System.out.println(maxSubArray(nums));

	}
	public static int maxSubArray(int[] nums) {
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		if(nums.length == 1)
			return nums[0];
		for(int i = 0;i < nums.length; i++) {
			if(currentSum < 0) {
				currentSum = 0;
			}
			currentSum+=nums[i];
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}

}
