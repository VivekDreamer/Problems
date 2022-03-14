import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

	public static void main(String[] args) {
		String s = "a1b2";
		List<String> ans = new ArrayList<String>();
		permute(s.toCharArray(),ans,0);
		System.out.println(ans);
	}

	private static void permute(char[] str, List<String> ans, int index) {
		System.out.println(str);
		if(str.length == index) {
			ans.add(new String(str));
			return;
		}
		if(Character.isDigit(str[index])){
			permute(str, ans, index+1);
			return;
		}
		else {
			str[index] = Character.toLowerCase(str[index]);
			permute(str, ans, index+1);
			
			str[index] = Character.toUpperCase(str[index]);
			permute(str, ans, index+1);
		}
		
	}

}
