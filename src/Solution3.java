

class Solution3{
public static void main(String[] args) {
	int nums[] = {-4,-1,0,3,10};
	
	int result[] = sortedSquares(nums);
	for(int i=0;i<result.length;i++) {
		System.out.print(result[i]+" ");
	}
}

private static int[] sortedSquares(int[] nums) {
	int result[] = new int[nums.length];
	
	for(int i =0;i<nums.length;i++) {
		result[i] = (nums[i]*nums[i]);
	}
	
	//sorting
	for(int i = 1;i<result.length;i++) {
		int j = i;
		int a = result[i];
		while((j>0)&&(result[j-1]>a)) {
			result[j] = result[j-1];
			j--;
		}
		result[j]=a;
	}
	return result;
}	
}