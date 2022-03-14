import java.util.HashMap;
import java.util.Map;

public class SubArraysSumDivisibleByK {

	public static void main(String[] args) {		
		System.out.println( subarraysDivByK1(new int[] {4,5,0,-2,-3,1}, 5));
	}
    public static int subarraysDivByK(int[] nums, int k) {
  
    	if((nums.length == 1)&&(nums[0]) == k)
            return 1;  	
    	int ans = 0;
    	int sum = 0;
    	int rem = 0;
  
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	map.put(0, 1);
    	for(int i = 0 ; i < nums.length; i++) {
//    		System.out.println(rem+" :first");
//    		System.out.println(map);
    		sum += nums[i];
    		rem = sum % k;
            if(rem < 0)
                rem += k;
    		
//    		System.out.println(sum);
    		
//    		System.out.println(map.containsKey(rem));
    		if(map.containsKey(rem)) {
    			System.out.println("vivek");
    			ans+=map.get(rem);
    			map.put(rem, map.get(rem)+1);	
    		}	
    		else {
    			map.put(rem, 1);
    		}
//    		System.out.println("*****************************");
//    		System.out.println(rem);
//    		System.out.println(map);
    	}
//    	System.out.println(map);
     	return ans;
    }
    //logic 2
    public static int subarraysDivByK1(int[] nums, int k) {
        int count = 0, sum = 0, rem = 0;
        int[] remArr = new int[k];
        remArr[0] = 1;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            rem = sum % k;
            if(rem < 0)
                rem += k;
            count += remArr[rem]++;
        }
        return count;
    }
}
