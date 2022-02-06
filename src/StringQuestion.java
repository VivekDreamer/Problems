import java.util.HashSet;

public class StringQuestion {

	public int lengthOfLongestSubstringLogic1(String s) {
        int start=0,end=0,count=0,max=-1;
        HashSet<Character> hset = new HashSet<>();
        while(end < s.length()){
            char current = s.charAt(end);
            if( !hset.contains(current) ){
                hset.add(current);
                end++;
                count = end - start;
            }
            else{
                if( max < count )max = count;
                while( start <= end && end < s.length())
                {
                    if(s.charAt(start) != s.charAt(end)){
                        hset.remove(s.charAt(start));
                        start++;
                    }
                    else{
                        start++;
                        end++;
                        break;
                    }
                }
            }
        }
        if( max < count )max = count;
        if( max == -1)max = s.length();
        return max;
    }

	//pwwkew
	public int lengthOfLongestSubstringLogic2(String s) {
		
		int start = 0, end = 0, max = -1;
		HashSet<Character> hset = new HashSet<>();
		while( end < s.length()) {
			if(!hset.contains(s.charAt(end))) {
				hset.add(s.charAt(end));
				end++;
				max = Math.max(hset.size(), max);
			}
			else {
				hset.remove(s.charAt(start));
				start++;
			}
		}
		return max;
	}
}

