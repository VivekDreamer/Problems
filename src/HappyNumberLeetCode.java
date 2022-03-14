import java.util.HashSet;
import java.util.Set;

public class HappyNumberLeetCode {

	public static void main(String[] args) {
		System.out.println(isHappy(19));

	}
	public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<Integer>();
		while(n != 1) {
			if(set.contains(n))
				return false;
			set.add(n);
		//	System.out.println("****************************************");
			n = sum(n);	
		}
		return true;
	    }
	
	public static int sum(int n) {
		int sum = 0;
		while(n > 0) {
	//		System.out.println(n);
			sum += (n%10) * (n%10);
	//		System.out.println(sum);
			n = n/10; 
		}
	//	System.out.println(sum);
		return sum;
	}

}
