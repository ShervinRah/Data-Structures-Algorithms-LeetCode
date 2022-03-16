package LeetCode;
import java.util.*;

public class RomantoInteger {
	
	public static void main (String args[]) {
		
		String roman = "CMXCIX";
		
		int result = toInteger(roman);
		
		System.out.println(result);	
		
	}
	
	public static int toInteger(String str) {
		
		HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
		mp.put('I', 1);
		mp.put('V', 5);
		mp.put('X', 10);
		mp.put('L', 50);
		mp.put('C', 100);
		mp.put('D', 500);
		mp.put('M', 1000);
		
		char arr [] = str.toCharArray();
		int sum = 0;
		
		/*if(arr.length < 2) {
			
			return mp.get(arr[0]);
		}*/
		
		for(int i = 0; i < arr.length; i++) {
			
			if((i + 1 < arr.length)) {
				
				if(mp.get(arr[i]) < mp.get(arr[i + 1])) {
					
					sum = sum - mp.get(arr[i]);				
				}
				else {
					
					sum = sum + mp.get(arr[i]);
				}
			}
			
		}
		sum  = sum + mp.get(arr[arr.length-1]);
		
		return sum;
	}
	

}
