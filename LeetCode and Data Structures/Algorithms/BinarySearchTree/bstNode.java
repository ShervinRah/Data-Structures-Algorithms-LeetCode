package BinarySearchTree;

public class bstNode {
	
	int value; 
	bstNode left;
	bstNode right;
	
	public bstNode() {
		
		value = 0;
		left = null;
		right = null;
	}
	
	public bstNode(int value) {
		
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public bstNode(int value, bstNode left, bstNode right) {
		
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	bstNode root; 
	
	public void addNode(int value) {
		
		if(root == null) {
			
			bstNode node = new bstNode(value);
			root = node;
		}
		else {
			
			bstNode focus_node = root;
			bstNode parent;
			
			while(focus_node != null) {
				
				parent = focus_node;
				
				if(focus_node.value > value) {
					
					focus_node = focus_node.left;
					
					if(focus_node == null) {
						
						parent.left = new bstNode(value);
					}
				}
				else {
					
					focus_node = focus_node.right;
					
					if(focus_node == null) {
						
						parent.right = new bstNode(value);
					}
					
				}
				
			}	
			
		}
		
	}
	
	public void printBST(bstNode node) {
		
		if(node != null) {
			
			printBST(node.left);
			System.out.print(node.value + " ");
			printBST(node.right);
		}
	}
	
	public static void main (String args[]) {
		
		bstNode node = new bstNode();
		node.addNode(7);
		node.addNode(9);
		node.addNode(4);
		node.addNode(23);
		node.addNode(8);
		node.addNode(11);
		node.addNode(2);
		node.printBST(node.root);
		
	}

}
