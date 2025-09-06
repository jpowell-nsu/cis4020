package linkedlist;

public class Node {
	
	Object item;
	Node next;

	Node(Object newItem) {
		item = newItem;
	    next = null;
	}

	Node(Object newItem, Node nextNode) {
		item = newItem;
		next = nextNode;
	}
}