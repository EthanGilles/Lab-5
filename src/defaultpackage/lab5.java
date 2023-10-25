package defaultpackage;

public class lab5 {
	
	public static void main(String[] args) {
		
		myBinarySearchTree tree = new myBinarySearchTree();
		
		myTreeIterator itr = new myTreeIterator();
		
		TreeIteratorTesting test = new TreeIteratorTesting(tree, itr);
		
		System.out.print("The tree is in order: " + test.checkOrder());
		
	}
}
