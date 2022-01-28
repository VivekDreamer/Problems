
public class RotateArray {

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(nums, k);
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]);
	}
	
	 public static void rotate(int[] nums, int k) {
	        k = k% nums.length;
	        reversing(nums,0,nums.length-1);
	        reversing(nums,0,k-1);
	        reversing(nums,k,nums.length-1);
	    }
	    public static void reversing(int[] nums, int start, int end){
	        while(start<end){
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	            start++;
	            end--;
	        }

	    }

}
