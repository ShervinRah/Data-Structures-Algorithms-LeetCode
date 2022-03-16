package LeetCode;
import java.util.LinkedList;
import java.util.*;

public class AddTwoNums{
	
	int value;
	AddTwoNums next; 
	
	AddTwoNums(){};
	AddTwoNums(int value){
		
		this.value = value;
	}
	AddTwoNums(int value, AddTwoNums next){
		
		this.value = value;
		this.next = next;
	}
	
	public static AddTwoNums addTwoNumbers(AddTwoNums l1, AddTwoNums l2) {
		
		AddTwoNums dummy_head = new AddTwoNums(0);
		AddTwoNums list1 = l1;
		AddTwoNums list2 = l2;
		AddTwoNums result = dummy_head; 
		int carry = 0; 
		
		while(list1 != null || list2 != null) {
			
			int x = 0; 
			int y = 0; 
			
			if(list1 != null) {
				
				x = list1.value;
			}
			else {
				
				x = 0;
			}
			if(list2 != null) {
				
				y = list2.value;
			}
			else {
				
				y = 0;
			}
			int sum = x + y + carry;
			carry = sum / 10;
			result.next = new AddTwoNums(sum % 10);
			result = result.next;
			if(list1 != null) {
				
				list1 = list1.next;
			}
			if(list2 != null) {
				
				list2 = list2.next;
			}
		}
		if(carry > 0) {
			
			result.next = new AddTwoNums(carry);
		}
		
		return dummy_head.next;
			
	}
	
	public static void show(AddTwoNums list) {
		
		AddTwoNums lst = list;
		while(lst.next != null) {
			
			System.out.print(lst.value + " -> ");
			lst = lst.next;
		}
		System.out.println(lst.value);
		
	}
	
	public static void printSum(AddTwoNums l1, AddTwoNums l2) {
		
		AddTwoNums result = AddTwoNums.addTwoNumbers(l1, l2);
		
		while(result.next != null) {
			
			System.out.print(result.value + " -> ");
			result = result.next;
		}
		System.out.println(result.value);
		
	}
	
	public static void main (String args[]) {
		
		AddTwoNums lst1 = new AddTwoNums();
		lst1.value = 2;
		lst1.next = new AddTwoNums();
		lst1.next.value = 4;
		lst1.next.next = new AddTwoNums();
		lst1.next.next.value = 3;
		
		AddTwoNums lst2 = new AddTwoNums();
		lst2.value = 5;
		lst2.next = new AddTwoNums();
		lst2.next.value = 6;
		lst2.next.next = new AddTwoNums();
		lst2.next.next.value = 4;
		
		AddTwoNums.show(lst1);
		AddTwoNums.show(lst2);
		
		AddTwoNums.printSum(lst1, lst2);
		
		
		
		
	}

}


