package defaultpackage;

// ETHAN GILLES

public abstract class BinarySearchTree {
	public int size;
	public Node root;
	
	public static class Node {
		
		int data;
		Node left, right, parent; // each node has left, right, parent, for tree itr
		
		public Node(int data, Node parent) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public abstract boolean add(int data);
	
	
	public int getSize() {
		return size;
	}
}
