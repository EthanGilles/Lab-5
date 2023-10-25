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
		 if (root == null) {
	            root = new Node(data, null);
	            return true;
	     } 
		 else {
	            return add(data, root);
	     }
	}
	
	//private recursive helper method
	private boolean add(int data, Node node) {
		 if (data < node.data) {
			 if (node.left == null) {
				 node.left = new Node(data, node);
				 return true;
	         } 
			 else {
				 return add(data, node.left);
	         }
	     } 
		 else if (data > node.data) {
	            if (node.right == null) {
	                node.right = new Node(data, node);
	                return true;
	            } 
	            else {
	               return add(data,node.right);
	            }
	        }
		 
		 if(node.data == data) {
			 return false;
		 }
		 
		return true;
	}

}
