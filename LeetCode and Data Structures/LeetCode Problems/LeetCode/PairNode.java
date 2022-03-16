package LeetCode;

public class PairNode {
	
	int value;
	PairNode next;
	
	PairNode(){}
	
	PairNode(int value){
		
		this.value = value;
	}
	PairNode(int value, PairNode next){
		
		this.value = value;
		this.next = next;
	}
	
	public static PairNode twoPairs(PairNode list) {
		
		PairNode dummy = new PairNode(0,list);
		PairNode prev = dummy;
		PairNode curr = list;
		
		while(curr != null && curr.next != null) {
			
			PairNode nextPair = curr.next.next;
			PairNode second = curr.next;
			
			second.next = curr;
			curr.next = nextPair;
			prev.next = second;
			
			prev = curr;
			curr = nextPair;

		}
		
		return dummy.next;
		
		
	
	}
	
	public static void showPairSwap(PairNode list) {
		
		
		PairNode result = PairNode.twoPairs(list);
		
		while(result.next != null) {
			
			System.out.print(result.value + " -> ");
			result = result.next;
		}
		
		System.out.print(result.value);
		
	}
	
	public static void main (String args[]) {
		
		PairNode lst = new PairNode();
		lst.value = 1;
		lst.next = new PairNode();
		lst.next.value = 2;
		lst.next.next = new PairNode();
		lst.next.next.value = 3;
		lst.next.next.next = new PairNode();
		lst.next.next.next.value = 4;
		lst.next.next.next.next = new PairNode();
		lst.next.next.next.next.value = 5;
		lst.next.next.next.next.next = new PairNode();
		lst.next.next.next.next.next.value = 6;
		
		PairNode.showPairSwap(lst);
		
	
	}

}
