package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class arraylist {
	
	public static void main (String args[]) {
		

		
		
		long start = System.nanoTime(); 
	
		List<String> lst2 = new ArrayList<>(10000);
		
		for(int i = 0; i < 10000; i++) {
			
			lst2.add(i, "Shervin");
			
		}//
		
		long end = System.nanoTime() - start;
		
		System.out.println(end);
		
		
		
		
		
	}

}
