package LeetCode;
import java.util.*;

public class longestsubstring {
	
	public static int longestSub(String str) {
		
		char [] str1 = str.toCharArray();
        int left = 0;
        int count = 0;
        Set<Character> st = new HashSet<Character>();
        
        for(int right = 0; right < str1.length; right++) {
        	
        	while(st.contains(str1[right])) {
        		
        		st.remove(str1[left]);
        		left = left + 1;
        	}
        	
        	st.add(str1[right]);
        	count = Math.max(count, right + 1 - left);
        
        }
        
        return count;
	}
	
	public static void main (String args[]) {
		
		
		String str1 = "abcabba";
		String str2 = "pwwkewpa";
		String str3 = "aaaabbccdedarahimszk";
		String str4 = "aabbcdefaabb";
	
		
		System.out.println(longestSub(str1));
		System.out.println(longestSub(str2));
		System.out.println(longestSub(str3));
		System.out.println(longestSub(str4));
	}

}
