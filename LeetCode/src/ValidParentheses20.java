import java.util.LinkedList;


public class ValidParentheses20 {
	
	public boolean isValid(String s) {
		if(s == null || "".equals(s))
			return false;
		if(s.length() % 2 != 0)
			return false;
		LinkedList<Character> stack = new LinkedList<Character>(); 
		for(int i = 0 ; i < s.length() ; i++) {
			char temp = s.charAt(i);
			if('(' == temp || '[' == temp || '{' == temp) {
				stack.push(temp);
			}
			
			if(')' == temp) {
				if(stack.isEmpty())
					return false;
				char pop = stack.pop();
				if(!(pop == '(')) {
					return false;
				}
					
			}
			
			if(']' == temp) {
				if(stack.isEmpty())
					return false;
				char pop = stack.pop();
				if(!(pop == '[')) {
					return false;
				}
			}
			
			if('}' == temp) {
				if(stack.isEmpty())
					return false;
				char pop = stack.pop();
				if(!(pop == '{')) {
					return false;
				}
			}
			
			
		}
		if(!stack.isEmpty())
			return false;
		return true;
    }
	
	public static void main(String[] args) {
//		String s = ")}{({))[{{[}";
		String s = "()[]{}";
		System.out.println(new ValidParentheses20().isValid(s));
	}
	

}
