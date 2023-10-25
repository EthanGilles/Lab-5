package defaultpackage;

public class myBinarySearchTree extends BinarySearchTree {
	
	/* TASK ONE
	 * ETHAN GILLES
	 * implemented add method with public call and private recursive function.
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
		 else
			 return add(data, root);
	}
	
	//private recursive helper method
	//accounts for parent field, so that each node has left, right and parent, for tree iterator.
	private boolean add(int data, Node node) {
		 if (data < node.data) {
			 if (node.left == null) {
				 node.left = new Node(data, node);
				 super.size++;
				 return true;
	         } 
			 else {
				 return add(data, node.left);
	         }
		 } 
		 else if (data > node.data) {
			 if (node.right == null) {
	                node.right = new Node(data, node);
	                super.size++;
	                return true;
	         } 
			 else {
	               return add(data,node.right);
	         }
	      }
		 
		 if(node.data == data) {
			 return false; // if value is already in the tree, don't add it.
		 }
		 
		return true;
	}

}
