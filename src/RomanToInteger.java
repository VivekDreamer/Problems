import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a roman number: ");
		String input = sc.next();
		System.out.println(romanToInt(input));
		
		
	}
	
	public static int romanToInt(String s) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		 map.put('I',1);
		 map.put('V',5);
		 map.put('X',10);
		 map.put('L',50);
		 map.put('C',100);   
		 map.put('D',500);   
		 map.put('M',1000); 
		
		 int result = 0;
		 
		 for(int i = 0; i< s.length(); i++) {
			 char ch = s.charAt(i);      // Current Roman Character
		      
		      //Case 1
		      if(i>0 && map.get(ch) > map.get(s.charAt(i-1)))
		      {
		        result += map.get(ch) - 2*map.get(s.charAt(i-1));
		      }
		      
		      // Case 2: just add the number to result.
		      else
		        result += map.get(ch); 
		 }
		 return result;
    }

}
