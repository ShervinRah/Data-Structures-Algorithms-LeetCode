package LeetCode;
import java.util.Stack;

public class LeetCodeValidParentheses {
	
	public static void main (String args[]) {
		
		String str = "{([])}";
		
		System.out.println(isBalanced(str));
		
	}
	
	public static boolean isBalanced(String str) {
		
		if(str.length() % 2 != 0) {
			
			return false;
		}
		
		Stack<Character> stk = new Stack<Character>();
		
		char [] chr = str.toCharArray();
		
		for(int i = 0; i < chr.length; i++) {
			
			if(chr[i] == '{' || chr[i] == '(' || chr[i] == '[') {
				
				stk.push(chr[i]);
				
			}
			if(chr[i] == '}' || chr[i] == ')' || chr[i] == ']') {
				
				char top = stk.pop();
				
				if((top == '{' && chr[i] != '}') || (top == '(' && chr[i] != ')') || (top == '[' && chr[i] != ']')) {
					
					return false;
				}
				
			}
			
		}
		
		return true;
	}
	

}
