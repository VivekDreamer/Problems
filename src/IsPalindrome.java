
public class IsPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome2(121));
	}
	//logic 1
	public static boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		//1221
		if(s.length()%2==0) {
			int j = s.length();
			for(int i = 0; i < s.length()/2; i++) {
				if(s.charAt(i)!=s.charAt(j-1))
					return false;
				else 
					j--;
			}
		}
		//121  s.length/2 = 1
		else {
			int j = s.length();
			for(int i = 0 ; i <= s.length()/2; i++) {		
				if(s.charAt(i)!=s.charAt(j-1))
					return false;
				else 
					j--;
			}
		}
		return true;    
    }
	//logic 2
	private static boolean isPalindrome2(int num) {
		String s = String.valueOf(num);
        int i =0, j = s.length()-1;
        while (i<j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
