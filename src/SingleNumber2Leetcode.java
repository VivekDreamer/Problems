
public class SingleNumber2Leetcode {

	public static void main(String[] args) {
		int[] nums = {2,2,3,2}; 
		System.out.println(singleNumber(nums));

	}
   public static int singleNumber(int[] nums) {
	      
	   	   int ones = 0;
	       int twos = 0;
	       int threes = 0;
	       
	       for(int i = 0; i < nums.length; i++) {
	    	   twos |= ones & nums[i];
	    	   ones ^= nums[i];
	    	   threes = ones & twos;
	    	   ones &= ~threes;
	    	   twos &= ~threes;
	       }
	       return ones;
	    }
}

