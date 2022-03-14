import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
	String	s = "()[]{}";
	System.out.println(isValid(s));	

	}
	  public static boolean isValid(String s) {
		  Stack<Character> stack = new Stack<>();
	      for(char each: s.toCharArray()) {
	    	  if(each == '(') stack.push(')');
	          else if(each == '{') stack.push('}');
	          else if(each == '[') stack.push(']');
	          else if(stack.isEmpty() || stack.pop() != each) return false;
	      }
	     return stack.isEmpty();
	  }
}
