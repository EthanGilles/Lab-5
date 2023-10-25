package defaultpackage;

//Author - James Libby
public class TreeIteratorTesting {
    
    private int[] x;
	
	public TreeIteratorTesting(BinarySearchTree bst, ITreeIterator treeIter) {
		bst.add(1);
		bst.add(2);
		bst.add(5);
		bst.add(4);
		x = treeIter.SequenceArray(bst);
	}
	
	public boolean checkOrder() {
	    int[] array = new int[4];
	    array[0] = 1;
	    array[1] = 2;
	    array[2] = 4;
	    array[3] = 5;
	    for(int i = 0; i < 4; i++) {
	        if(x[i] != array[i]) {
	            return false;
	        }
	    }
	    return true;
	}
}