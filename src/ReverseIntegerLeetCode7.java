
public class ReverseIntegerLeetCode7 {

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}
	public static int reverse(int x) {
		 String number = String.valueOf(x);
			char[] ch = number.toCharArray();
			String ans = "";
			if(ch[0] == '-') {
				ans+='-';
				for(int i = ch.length-1; i >=1 ; i--) 
					ans+=number.charAt(i);
			}
			else {
				for(int i = ch.length-1; i >=0 ; i--) 
					ans+=number.charAt(i);
			}
	        try {
				int result = Integer.parseInt(ans);
				return result;
			} catch (Exception e) {
				return 0;
			}
    }
}
