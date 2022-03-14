
public class Leetcode1281 {

	public static void main(String[] args) {
		System.out.println(subtractProductAndSum(343));
		
	}
	 public static int subtractProductAndSum(int n) {
		 int product = 1;
		 int sum = 0;
		 String s = String.valueOf(n);
		 char[] sh = s.toCharArray();
		 for(int i =0; i< sh.length; i++) {
			 product *= sh[i]-'0';
			 sum += sh[i]-'0';
		 }
		 return product-sum;
	 }
}
