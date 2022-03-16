
public class SumOfAllOddLengthSubArrays {

	public static void main(String[] args) {
		int[] arr = {1,4,2,5,3};
		System.out.println(sumOddLengthSubarrays(arr));
	}

	public static int sumOddLengthSubarrays(int[] arr) {
	    int resultSum = 0;
		for(int i = 0; i < arr.length; i++) {
			int k = 1;
			int sum = 0;
	    	for(int j = i; j < arr.length; j++) {
	    	    sum += arr[j];
	    	    if(k % 2 == 1) {
	    	    	resultSum += sum;
	    	    }
	    	    k++;
	    	}
	    }
		return resultSum;
	}
}