import java.util.Arrays;

public class LengthOfLastWordLeetCode58 {

	public static void main(String[] args) {
	//	System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
		System.out.println(lengthOfLastWord1("   fly me   to   the moon  "));

	}
	public static int lengthOfLastWord(String s) {
		String[] ans = s.split("\\s+");
		return ans[ans.length - 1].length();
	}
	public static int lengthOfLastWord1(String s) {
	        int p = s.length() - 1;
	        while (p >= 0 && s.charAt(p) == ' ') {
	            p--;
	        }
	        System.out.println(p);
	        int length = 0;
	        while (p >= 0 && s.charAt(p) != ' ') {
	            p--;
	            length++;
	        }
	        return length;
	    }
}
