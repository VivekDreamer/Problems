import java.util.Arrays;

public class LargestTrianglePerimeter {

	public static void main(String[] args) {
		System.out.println(largestPerimeter1(new int[] {1,2,1}));

	}
	 public static int largestPerimeter(int[] nums) {
         Arrays.sort(nums);
         if(nums.length <= 2)
        	 return 0;
         for(int i = nums.length-1 ; i >= 2; i--) {
        	 int firstSide = nums[i];
        	 int secondSide = nums[i-1];
        	 int thirdSide = nums[i-2];
        	 if(triangle(firstSide,secondSide,thirdSide)) {
        		 return firstSide+secondSide+thirdSide;
        	 }	 
         }
		 return 0;   
	 }
	private static boolean triangle(int firstSide, int secondSide, int thirdSide) {
		if(secondSide + thirdSide > firstSide)
			return true;
		return false;
	}
	//logic 2
	public static int largestPerimeter1(int[] nums) {
	       Arrays.sort(nums);
	        for(int i = nums.length-3;i>=0;i--){
	        if(nums[i]+nums[i+1]>nums[i+2])
	            return nums[i]+nums[i+1]+nums[i+2];
	        }
	        return 0;
	    }
}
