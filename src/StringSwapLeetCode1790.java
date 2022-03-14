import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringSwapLeetCode1790 {

	public static void main(String[] args) {
		System.out.println(areAlmostEqual("npv", "zpn"));

	}
	 public static boolean areAlmostEqual(String s1, String s2) {
//	    char[] string1 = s1.toCharArray();
//	    char[] string2 = s2.toCharArray();
//	    Arrays.sort(string1);
//	    Arrays.sort(string2);
//	    String.valueOf(string1);
//	    String.valueOf(string2);
//	    s1 = Stream.of(s1.split(""))
//	    	          .sorted()
//	    	          .collect(Collectors.joining());
//	    s2 = Stream.of(s2.split(""))
//  	          .sorted()
//  	          .collect(Collectors.joining());
//	    
	    if(s1.equals(s2))
	        return true;
	    
	    List<Integer> list = new ArrayList<Integer>();
	    for(int i = 0; i < s1.length();i++) {
	    	if(s1.charAt(i) != s2.charAt(i))
	    		list.add(i);
	    	if(list.size() > 2)
	    		return false;
	    }
	    if(list.size() == 2) {
	    	if((s1.charAt(list.get(0)) == s2.charAt(list.get(1))) && (s1.charAt(list.get(1)) == s2.charAt(list.get(0))))
	    		return true;
	    }
		 return false;	          
	 }
}
