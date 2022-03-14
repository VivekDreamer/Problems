//Minimum Operations to Make the Array Alternating | Leetcode 2170 | TC O(n) SC(1) 
public class minimumOperations {

	public static void main(String[] args) {
		int nums[] =  {3,1,3,2,4,3};
		System.out.println(minimumOperations(nums));

	}
    public static int minimumOperations(int[] nums) {
    	//make count array for even and odd indices
    	int[] freqOdd = new int[10001];
    	int[] freqEven = new int[10001];
    	
    	int n = nums.length;
    	
    	int oddMax = 0;
    	int oddMaxFrequency = 0;
    	int oddSecondMax = 0;
    	int oddSecondMaxFrequency = 0;
    	
    	// keeping track of frequency of each number in nums[] which occur at odd index
    	for(int i = 1; i < n; i+=2) {
    		freqOdd[nums[i]]++;
    	}
    	
    	// calculating which element appears most time 
    	for( int i = 0; i < freqOdd.length ; i++ ) {
    		if(freqOdd[i] > oddMaxFrequency) {
    			oddMaxFrequency = freqOdd[i];
    			oddMax = i;
    		}
    	}
    	
    	//calculating which element appears second most time 
    	for( int i = 0; i < freqOdd.length ; i++) {
    		if(freqOdd[i] > oddSecondMaxFrequency && i != oddMax) {
    			oddSecondMaxFrequency = freqOdd[i];
    			oddSecondMax = i;
    		}
    	}
    	
    	int evenMax = 0;
    	int evenMaxFrequency = 0;
    	int evenSecondMax = 0;
    	int evenSecondMaxFrequency = 0;
    	
    	// keeping track of frequency of each number in nums[] which occur at even index
    	for(int i = 0; i < n; i+=2) {
    		freqEven[nums[i]]++;
    	}
    	
    	// calculating which element appears most time 
    	for( int i = 0; i < freqEven.length ; i++ ) {
    		if(freqEven[i] > evenMaxFrequency) {
    			evenMaxFrequency = freqEven[i];
    			evenMax = i;
    		}
    	}
    	
    	//calculating which element appears second most time 
    	for( int i = 0; i < freqEven.length ; i++) {
    		if(freqEven[i] > evenSecondMaxFrequency && i != evenMax) {
    			evenSecondMaxFrequency = freqEven[i];
    			evenSecondMax = i;
    		}
    	}
    	
    	//if max of both freqOdd and freqEven is different then,
    	if(oddMax != evenMax)
    		return n - oddMaxFrequency - evenMaxFrequency;
    	//else take secondMax of either odd or even
    	else
    		return Math.min(n - oddMaxFrequency - evenSecondMaxFrequency, n - oddSecondMaxFrequency - evenMaxFrequency);
    }

}
