
public class Solution4 {
public static void main(String[] args) {
	int nums[] = {0,1,0,3,12};
	int result[] = moveZeroes(nums);
	for(int i=0;i<result.length;i++) {
		System.out.print(result[i]+" ");
	}
}

private static int[] moveZeroes(int[] nums) {
	if(nums.length==1)return nums;
	int lastNonZero = 0;
	for(int i =0;i<nums.length;i++) {
		if(nums[i]!=0)
			nums[lastNonZero++]=nums[i];
	}
	for(int i=lastNonZero;i<nums.length;i++) {
		nums[i]=0;
	}
	return nums;
}
}
