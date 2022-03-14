import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
	  int firstUniqChar = firstUniqChar("leetcode");
	  System.out.println(firstUniqChar);
	}
    public static int firstUniqChar(String s) {
    	List<Character> list = new ArrayList<>();
    	int max = Integer.MAX_VALUE;
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	for(int i = 0; i < s.length(); i++)
    		 map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    	System.out.println(map);
    	for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			 if(entry.getValue()==1) {
				Character key = entry.getKey();
				max = Math.min(max, s.indexOf(key));
			}
		 }
    	
    	return max;
    }
    //logic 2 
    public static int firstUniqChar1(String s) {
        HashMap<Character,Integer> hmp=new HashMap<>();
      for(int i=0;i<s.length();i++){
          char c=s.charAt(i);
          if(hmp.size()==0){
              hmp.put(c,1);
          }else{
              if(hmp.containsKey(c)){
                    hmp.put(c,hmp.get(c)+1);
              }else{
                  hmp.put(c,1);
              }
          }
     }
     for(int i=0;i<s.length();i++){
          char c=s.charAt(i);
          if(hmp.get(c)==1)
              return i;
      }
      return -1;
}
}
