package defaultpackage;
import java.util.*;

public class myTreeIterator implements ITreeIterator {

	@Override
	public int[] SequenceArray(BinarySearchTree bst) {
		int nextIndex = 0;
		int[] intArr = new int[bst.size];
		Stack<Node> stk = new Stack<Node>();
		Node currentNode = bst.root;
		while( currentNode != null){
			stk.push(currentNode);
			currentNode = currentNode.left;
		}
		while(!stk.isEmpty()) {
			Node working = stk.pop();
			intArr[nextIndex] = working.data;
			nextIndex++;
			if(working.right != null) {
				Node toAdd = working.right;
				while(toAdd!=null) {
					stk.push(toAdd);
					toAdd = toAdd.left;
				}
			}
		}
		return intArr;
	}

}
