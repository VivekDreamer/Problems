
public class SignOfProductLeetcode1822 {

	public static void main(String[] args) {
		int arraySign = arraySign(new int[] {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41
});
		System.out.println(arraySign);

	}

	public static int arraySign(int[] nums) {
		double x = 1;
		for(int i = 0; i < nums.length; i++) {
			x*=nums[i];
		}
		System.out.println(x);
        int signFunc = signFunc(x);
        return signFunc;
    }

	private static int signFunc(double x) {
		if(x < 0)return -1;
		else if(x > 0)return 1;
		else
			return 0;
	}
	
}
