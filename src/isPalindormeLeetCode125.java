
public class isPalindormeLeetCode125 {

	public static void main(String[] args) {
		System.out.println(isPalindrome("0P"));    //0P
	}
	public static boolean isPalindrome(String s) {
		String s1 = s.toLowerCase();
		String ans = "";
		for(char c : s1.toCharArray()) {
			if(Character.isDigit(c) || Character.isLetter(c))
				ans+=c;
		}
			if(ans.equals(new StringBuilder(ans).reverse().toString())) 
				return true;
		return false;
	}
	public static boolean isPalindrome1(String s) {
		String s1 = s.toLowerCase();
		String ans = "";
		for(char c : s1.toCharArray()) {
			if(Character.isDigit(c) || Character.isLetter(c))
				ans+=c;
		}
		int a_pointer = 0;
		int b_pointer = ans.length()-1;
		while(a_pointer < b_pointer) {
			if(ans.charAt(a_pointer) != ans.charAt(b_pointer))
				return false;
			a_pointer+=1;
			b_pointer-=1;
		}
		return true;
	}
}
