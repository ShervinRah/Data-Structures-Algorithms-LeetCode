package LeetCode;
import java.util.Stack;

public class palindromenumber {

	
	
	public static boolean isPalindrome1(int num) {
		
		String number = String.valueOf(num);
		char[] digits = number.toCharArray();
		
		Stack<Character> stk = new Stack<Character>();
		
		for(int i = 0; i < digits.length; i++) {
			
			stk.push(digits[i]);
		}
		
		for(int i = 0; i < digits.length; i++) {
			
			if(stk.pop() != digits[i]) {
				
				return false;
			}
		}
		
		return true;	
	}
	
	/*public static boolean isPalindrome2(int num) {
		
		char [] chr;
		
		while((num/10) != 0) {
			
			
		}
	}*/
	
	
	public static void main(String args[]) {
		
		
		int someInt = 121;	
		
		//System.out.println(isPalindrome(someInt));
	}
	
	
	
	
	
}
