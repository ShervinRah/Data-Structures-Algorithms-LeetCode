package LeetCode;

public class containerWithMostWater {
	
	public static int mostWater(int arr []) {
		
		int result = 0; 
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i + 1; j < arr.length; j++) {
				
				int area = 0; 
				area = Math.min(arr[i], arr[j]) * (j - i);
				result = Math.max(area, result);
			}
			
		}
		
		return result;
	}
	
	public static int mostWaterOptimized(int arr[]) {
		
		int result = 0; 
		int area = 0; 
		
		int left = 0; 
		int right = arr.length - 1 ;
		
		while(left < right) {
			
			area = Math.min(arr[left], arr[right]) * (right - left);
			result = Math.max(area, result);
		
			if(arr[left] < arr[right]) {
			
				left += 1;
			}
			else {
			
				right -= 1;
			}
		
		}
		
		return result;
	}
	
	public static void main (String args[]) {
		
		
		int arr [] = {1,8,6,2,5,4,8,3,7};
		
		long nano_start1 = System.nanoTime();
		System.out.println(mostWaterOptimized(arr));
		long nano_end1 = System.nanoTime();
		System.out.println(nano_end1 - nano_start1);
		
		long nano_start2 = System.nanoTime();
		System.out.println(mostWater(arr));
		long nano_end2 = System.nanoTime();
		System.out.println(nano_end2 - nano_start2);
	}

}
