
public class HouseRobber1 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		System.out.println(rob(nums));
	}

	public static int rob(int[] nums) {
	        
	        int[] dp = new int[nums.length+1];
	        dp[0] = 0;
	        dp[1] = nums[0];
	        //{0,1,}
	        //{0,1,2,4,4}
	        for(int i = 1; i < nums.length; i++){
	            dp[i+1] = Math.max(dp[i],dp[i-1]+nums[i]); //(1,0+2)==> (1,2)
	            //dp[3] = (2,1+3) ==> (2,4)
	            //dp[4] = (4,2+1) ==> (4,3)
	        }   
	        return dp[nums.length];
	    }
 }