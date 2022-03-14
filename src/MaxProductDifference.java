
public class MaxProductDifference {

	public static void main(String[] args) {
		int[] arr = {5,6,2,7,4};
        int maxProductDifference = maxProductDifference(arr);
        System.out.println(maxProductDifference);
	}

	public static int maxProductDifference(int[] nums) {
	    int first_max = Integer.MIN_VALUE, second_max = Integer.MIN_VALUE;
	    int first_min = Integer.MAX_VALUE, second_min = Integer.MAX_VALUE;
	    for(int i = 0; i < nums.length; i++) {
	      if(nums[i] > first_max) {
	         second_max = first_max;
	         first_max = nums[i];
	      } else if(nums[i] > second_max) {
	         second_max = nums[i];
	      }
	            
	      if(nums[i] < first_min) {
	         second_min = first_min;
	         first_min = nums[i];
	       } else if(nums[i] < second_min) {
	         second_min = nums[i];
	       }
	   }
	        return first_max * second_max - first_min * second_min;
	    }
}


