package LeetCode;

public class MergeNode {
	
	int value;
	MergeNode next;
	
	MergeNode(){
		
		value = 0;
		next = null;
	}
	
	MergeNode(int value){
		
		this.value = value;
		this.next = null;
	}
	MergeNode(int value, MergeNode next){
		
		this.value = value;
		this.next = next;
	}
	
	public static MergeNode combineNodes(MergeNode l1, MergeNode l2) {
		
		MergeNode list1 = l1;
		MergeNode list2 = l2;
		MergeNode dummy = new MergeNode(0);
		MergeNode result = dummy;
		
		if(list1 == null && list2 == null){
            
            MergeNode empt = new MergeNode();
            empt = null;
            return empt;
        }
        if(list1 == null){
            
            return list2;
        }
        
        if(list2 == null){
            
            return list1;
        }
		
		while(list1 != null && list2 != null) {
			
			if(list1.value > list2.value) {
				
				result.next = new MergeNode();
				result.next = list2;
				list2 = list2.next;
			}
			else {
				result.next = new MergeNode();
				result.next = list1;
				list1 = list1.next;
			}
			
			result = result.next;
		}
		if(list1 != null) {
			
			result.next = new MergeNode();
			result.next = list1;
			list1 = list1.next;
			
		}
		else {
			
			result.next = new MergeNode();
			result.next = list2;
			list1 = list2.next;
			
		}
		return dummy.next;
	}
	
	public static void show(MergeNode list) {
		
		MergeNode lst = list;
		while(lst.next != null) {
			
			System.out.print(lst.value + " -> ");
			lst = lst.next;
		}
		System.out.println(lst.value);
		
	}
	
	public static void printCombineNode(MergeNode l1, MergeNode l2) {
		
		MergeNode result = MergeNode.combineNodes(l1, l2);
		
		while(result.next != null) {
			
			System.out.print(result.value + " -> ");
			result = result.next;
		}
		System.out.println(result.value);
		
	}
	
	public static void main (String args[]) {
		
		MergeNode lst1 = new MergeNode();
		lst1.value = 1;
		lst1.next = new MergeNode();
		lst1.next.value = 4;
		lst1.next.next = new MergeNode();
		lst1.next.next.value = 7;

		MergeNode lst2 = new MergeNode();
		lst2.value = 3;
		lst2.next = new MergeNode();
		lst2.next.value = 5;
		lst2.next.next = new MergeNode();
		lst2.next.next.value = 9;

		
		MergeNode.show(lst1);
		MergeNode.show(lst2);
		MergeNode.printCombineNode(lst1, lst2);
		
	}

}
