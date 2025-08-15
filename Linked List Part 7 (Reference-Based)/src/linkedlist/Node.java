package linkedlist;

public class Node {
	
	protected Object item;
	protected Node next;

	Node(Object newItem) {
		item = newItem;
	    next = null;
	} // end constructor

	Node(Object newItem, Node nextNode) {
		item = newItem;
		next = nextNode;
	} // end constructor

} // end class Node