package defaultpackage;

public abstract class BinarySearchTree {
	public int size;
	public Node root;
	
	public static class Node {
		
		int data;
		Node left, right;
		
		public Node(int data) {
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
