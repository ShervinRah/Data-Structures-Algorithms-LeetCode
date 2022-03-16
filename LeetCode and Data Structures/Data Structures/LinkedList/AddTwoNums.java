package LinkedList;

public class AddTwoNums {
	
	public static void main (String args[]) {
	
		ListNode lst1 = new ListNode();
		lst1.value = 2;
		lst1.next = new ListNode();
		lst1.next.value = 4;
		lst1.next.next = new ListNode();
		lst1.next.next.value = 3;
		
		ListNode lst2 = new ListNode();
		lst2.value = 5;
		lst2.next = new ListNode();
		lst2.next.value = 6;
		lst2.next.next = new ListNode();
		lst2.next.next.value = 4;
		
		ListNode.show(lst1);
		ListNode.show(lst2);
		
		ListNode.printSum(lst1, lst2);
		
		
		
		
	}

}
