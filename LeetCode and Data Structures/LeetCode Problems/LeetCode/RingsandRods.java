package LeetCode;

public class RingsandRods {
	
	public static int returnCount(String rings) {
		
		int red [] = new int [10];
		int blue [] = new int [10];
		int green [] = new int [10];
		
		for(int i = 0; i < rings.length(); i+=2) {
			
			int x = rings.charAt(i + 1) - '0';
			
			if(rings.charAt(i) == 'R') {
				
				red[x]++;
			}
			else if(rings.charAt(i) == 'B') {
				
				blue[x]++;
			}
			else {
				
				green[x]++;
			}				
		}
		
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			
			if(red[i] > 0 && blue[i] > 0 && green[i] > 0) {
				
				count++;
			}
		}
		
		return count;
	}
	
	public static void main (String args[]) {
		
		String str = "R0B3G3R3";
		
		System.out.println(returnCount(str));
	}
	
	

}
