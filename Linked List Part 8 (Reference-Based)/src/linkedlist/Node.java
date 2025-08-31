package linkedlist;

public class Node {
	
	protected Object item;
	protected Node next;
	protected Node prev;	
	
	protected Node(Node prevNode, Object newItem, Node nextNode) {
		item = newItem;
		next = nextNode;
		prev = prevNode;		
	}

}