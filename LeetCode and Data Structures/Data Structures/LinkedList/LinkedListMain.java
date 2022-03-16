package LinkedList;
import java.util.*;

public class LinkedListMain {
	
	public static void main (String args[]) {
		
		LinkedList lk = new LinkedList();
		lk.insert(6);
		lk.insert(3);
		lk.insert(15);
		lk.insertAtStart(8);
		lk.show();
		lk.insertAt(2, 22);
		System.out.println();
		lk.show();
		lk.insertAt(3, 7);
		System.out.println();
		lk.show();
		System.out.println();
		lk.insertAt(0, 1000);
		lk.show();
		lk.delete(0);
		System.out.println();
		lk.show();
		System.out.println();
		lk.delete(2);
		lk.show();
		
		
	}

}

