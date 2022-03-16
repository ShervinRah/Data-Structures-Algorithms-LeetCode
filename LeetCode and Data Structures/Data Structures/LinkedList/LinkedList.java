package LinkedList;

public class LinkedList {
	
	Node head;
	
	public void insert(int value) {
		
		Node node = new Node();
		node.value = value;
		node.next = null;
		
		if(head == null) {
			
			head = node;
		}
		else {
			
			Node n = head;
			while(n.next != null) {
				
				n = n.next;
			}
			
			n.next = node;
			
		}
	}
	
	public void insertAtStart(int value) {
		
		Node node = new Node();
		node.value = value;
		node.next = head;
		head = node;
		
	}
	
	public void insertAt(int index, int value) {
		
		Node node = new Node();
		node.value = value;
		node.next = null;
		
		if(index == 0) {
			
			insertAtStart(value);
		}
		else {
			
			Node n = head;
			for(int i = 0; i < index - 1; i++) {
				
				n = n.next;
			}
			
			node.next = n.next;
			n.next = node;
		}
		
	}
	public int delete(int index) {
		
		if(index == 0) {
			
			int temp = head.value;
			head = head.next;
			
			return temp;
		}
		else {
			
			Node n = head;
			Node n1;
			for(int i = 0; i < index - 1; i++) {
				
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			return n1.value;
		}
		
	}
	
	public void show(){
		
		Node node = head;
		
		while(node.next!=null){
			
			System.out.print(node.value + " -> ");
			node = node.next;
		}
		System.out.print(node.value);
	}
	
}
