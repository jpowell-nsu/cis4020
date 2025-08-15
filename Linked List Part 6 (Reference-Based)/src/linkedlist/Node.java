package linkedlist;

public class Node {
	
	protected Object item;
	protected Node next;

	public Node(Object newItem) {
		item = newItem;
	    next = null;
	} // end constructor

	public Node(Object newItem, Node nextNode) {
		item = newItem;
		next = nextNode;
	} // end constructor

} // end class Node