
public class ImplementstrStrLeetCode28 {

	public static void main(String[] args) {
		System.out.println(strStr1("hello", "ll"));
	}
	//logic 1
	public static int strStr(String haystack, String needle) {

		if(haystack == null)return 0;
		char[] hArray = haystack.toCharArray();
		char[] nArray = needle.toCharArray();
		int i = 0;
		int j = 0;
		while(i < hArray.length && j < nArray.length) {
			if(hArray[i] == nArray[j]) {
				i++;
				j++;
			}
			else {
				i = i - j + 1;
				j = 0;
			}
		}
		if(j == nArray.length)
			return i-j;
		return -1;		
	}
	
	//logic 2
	public static int strStr1(String haystack, String needle) {

		if(needle.isEmpty())
			return 0;
		if(haystack.length() < needle.length())
			return -1;
		for(int i = 0; i <= haystack.length()-needle.length(); i++) {
			int j;
			for(j = 0; j < needle.length(); j++) {
				if(haystack.charAt(i+j) != needle.charAt(j)) 
					break;	
			}
			if(j == needle.length())
				return i;	
		}
		return -1;
	}
	
	//logic 3
	public static int strStr2(String haystack, String needle) {
		if(haystack == null || needle == null || needle.length() > haystack.length())
			return -1;
		if(needle.length() == 0)
			return 0;
		for( int i = 0; i <= haystack.length()-needle.length(); i++) {
			if(haystack.charAt(i) == needle.charAt(0)) {
				if(haystack.substring(i,i+needle.length()).equals(needle))return i;
			}
		}
		return -1;
	}
	
	//logic 4
	public static int strStr3(String haystack, String needle) {
		if(needle.equals(" "))
            return 0;
        return haystack.indexOf(needle)>=0 ? haystack.indexOf(needle):-1;
	}
	
}
