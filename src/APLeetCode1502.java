import java.util.Arrays;

public class APLeetCode1502 {

	public static void main(String[] args) {
		int[] arr = {3,5,1};
		boolean canMakeArithmeticProgression = canMakeArithmeticProgression(arr);
		System.out.println(canMakeArithmeticProgression);
	}
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i = 0 ; i < arr.length-2; i++) {
        	if((arr[i+1]-arr[i]) != (arr[i+2]-arr[i+1]) )
        		return false;
        }
    	return true;
    }
}
