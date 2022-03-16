package LinkedList;
import java.util.LinkedList;
import java.util.*;

public class ListNode{
	
	int value;
	ListNode next; 
	
	ListNode(){};
	ListNode(int value){
		
		this.value = value;
	}
	ListNode(int value, ListNode next){
		
		this.value = value;
		this.next = next;
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode dummy_head = new ListNode(0);
		ListNode list1 = l1;
		ListNode list2 = l2;
		ListNode result = dummy_head; 
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
			result.next = new ListNode(sum % 10);
			result = result.next;
			if(list1 != null) {
				
				list1 = list1.next;
			}
			if(list2 != null) {
				
				list2 = list2.next;
			}
		}
		if(carry > 0) {
			
			result.next = new ListNode(carry);
		}
		
		return dummy_head.next;
			
	}
	
	public static void show(ListNode list) {
		
		ListNode lst = list;
		while(lst.next != null) {
			
			System.out.print(lst.value + " -> ");
			lst = lst.next;
		}
		System.out.println(lst.value);
		
	}
	
	public static void printSum(ListNode l1, ListNode l2) {
		
		ListNode result = ListNode.addTwoNumbers(l1, l2);
		
		while(result.next != null) {
			
			System.out.print(result.value + " -> ");
			result = result.next;
		}
		System.out.println(result.value);
		
	}

}

