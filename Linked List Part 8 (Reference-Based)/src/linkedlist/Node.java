package linkedlist;

public class Node {
	
	protected Node prev;	
	protected Object item;
	protected Node next;

	Node(Node prevNode, Object newItem, Node nextNode) {
		item = newItem;
		next = nextNode;
		prev = prevNode;		
	}

}