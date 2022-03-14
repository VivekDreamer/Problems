import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] arr = {9,8,7,6,5,4,3,2,1,0};
		int[] plusOne = plusOne(arr);
		System.out.println(Arrays.toString(plusOne));
	}
	public static int[] plusOne(int[] digits) {
//		String number1 = Arrays.toString(digits).replaceAll("\\[|\\]|,|\\s", "");
//		double number3 = Double.parseDouble(number1);
//		BigInteger number4 = new BigInteger(number1);
//		int number = (int)number3;
//		number4 = number4 + (BigInteger)1;
//		String result = String.valueOf(number);
//		int[] resultLast = new int[result.length()];
//		for (int i = 0; i < result.length(); i++)
//		{
//		    resultLast[i] = result.charAt(i) - '0';
//		}
////		
//		return resultLast;
	
		for(int i = digits.length-1 ; i >= 0; i--) {
			int number = digits[i] + 1;
	        System.out.println(Arrays.toString(digits));
			if(number == 10) {
				digits[i] = 0;
			}
			else {
				digits[i] = number;
				return digits;
			}
		}
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		System.out.println(Arrays.toString(result));
		return result;
	}
}
