package linkedlist;

/*********************************************************
Referenced-based implementation of the ADT list. This code is 
a slight modification to the book's code.
**********************************************************/
public class List implements ListInterface {

	// note: I moved the node into a private class,
	//	like the JCF LinkedList implementation, and
	//	removed the unused constructor for this example
	private class Node {
		Object item;
		Node next;

		Node(Object newItem, Node nextNode) {
			item = newItem;
			next = nextNode;
		}

	}

	private Node head;		// points to first item
	private int numItems; 	// number of items in list
	
	public List() {
		numItems = 0;
		head = null;
	}

	public boolean isEmpty() {
		return (numItems == 0);
	}

	public int size() {
		return numItems;
	}
	
	public void displayWithIdentities() {
		Node hare = head;
			
		System.out.printf("%-24s|%-12s|%-24s\n", "NODE", "ITEM", "NEXT");
		while (hare != null) {
			System.out.printf("%-24s|%-12s|%-24s\n", hare, hare.item, hare.next);
			hare = hare.next;
		}
	}
	
	private Node find(int index) {
		Node curr = head;

		for (int skip = 0; skip < index; skip++) {
			curr = curr.next;
		}
		
		return curr;
	}

	public Object get(int index) throws ListIndexOutOfBoundsException {
		if (index >= 0 && index < numItems) {
			Node curr = find(index);		// get node reference
			Object dataItem = curr.item;	// get the item
			return dataItem;
		} else {
			throw new ListIndexOutOfBoundsException("List index out of bounds on get");
		}
	}

	public void add(int index, Object item) throws ListIndexOutOfBoundsException {
		if (index >= 0 && index < numItems+1) {
			if (index == 0) {
				Node newNode = new Node(item, head);
				head = newNode;
			} else {
				Node prev = find(index-1);
				Node newNode = new Node(item, prev.next);
				prev.next = newNode;
			}
			numItems++;
		} else {
			throw new ListIndexOutOfBoundsException("List index out of bounds on add");
		}
	}

	public void remove(int index) throws ListIndexOutOfBoundsException {
		if (index >= 0 && index < numItems) {
			if (index == 0) {
				head = head.next;
			} else {
				Node prev = find(index-1);
				Node curr = prev.next;
				prev.next = curr.next;
			}
			numItems--;
		} else {
			throw new ListIndexOutOfBoundsException("List index out of bounds on remove");
		}
	}

	public void removeAll() {
		head = null;
		numItems = 0;
	}
	
}