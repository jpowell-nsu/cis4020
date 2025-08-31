package linkedlist;

public class Node {
	
	protected Object item;
	protected Node next;

	Node(Object newItem) {
		item = newItem;
	    next = null;
	}

	Node(Object newItem, Node nextNode) {
		item = newItem;
		next = nextNode;
	}

}