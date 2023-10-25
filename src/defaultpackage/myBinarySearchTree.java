package defaultpackage;

public class myBinarySearchTree extends BinarySearchTree {
	
	/* TASK ONE
	 * ETHAN GILLES
	 * 
	 */
	
	public myBinarySearchTree() {
		super.size = 0;
	}


	//public access method for add
	public boolean add(int data) {
		return add(data, super.root);
	}
	
	//private recursive helper method
	private boolean add(int data, Node node) {
		if(node == null) {
			node = new Node(data);
			super.size++;
		}
		else if(data == node.data) {
			return false;
		}
		else if(data < node.data)
			return add(data, node.left);
		else if(data > node.data)
			return add(data, node.right);
		
		return true;
	}

}
