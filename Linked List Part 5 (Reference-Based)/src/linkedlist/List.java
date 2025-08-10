package linkedlist;

/*********************************************************
Referenced-based implementation of the ADT list. This code is 
a slight modification to the book's code.
**********************************************************/
public class List implements ListInterface {

	private Node head;		// points to first item
	private int numItems; 	// number of items in list

	public List() {
		numItems = 0;
		head = null;
	}  // end default constructor

	public boolean isEmpty() {
		return (numItems == 0);
	}  // end isEmpty

	public int size() {
		return numItems;
	}  // end size

	// --------------------------------------------------
	// Locates a specified node in a linked list.
	// Precondition: index is the number of the desired node.
	//	Assumes that 1 <= index <= numItems+1
	// Postcondition: Returns a reference to the desired node.
	// --------------------------------------------------
	private Node find(int index) {
		Node curr = head;

		for(int skip = 0; skip < index; skip++) {
			curr = curr.next;
		}
		
		return curr;
	} // end find

	public Object get(int index) throws ListIndexOutOfBoundsException {
		if(index >= 0 && index < numItems) {
			// get reference to node, then data in node
			Node curr = find(index);
			Object dataItem = curr.item;
			return dataItem;
		} else {
			throw new ListIndexOutOfBoundsException("List index out of bounds on get");
		}
	} // end get

	public void add(int index, Object item) throws ListIndexOutOfBoundsException {
		if(index >= 0 && index < numItems+1) {
			if(index == 0) {
				// insert the new node at beginning of list
				Node newNode = new Node(item, head);
				head = newNode;
			} else {
				Node prev = find(index-1);
				// insert the new node after the node that prev references
				Node newNode = new Node(item, prev.next);
				prev.next = newNode;
			}
			numItems++;
		} else {
			throw new ListIndexOutOfBoundsException("List index out of bounds on add");
		}
	}  // end add

	public void remove(int index) throws ListIndexOutOfBoundsException {
		if(index >= 0 && index < numItems) {
			if(index == 0) {
				// delete the first node from the list
				head = head.next;
			} else {
				Node prev = find(index-1);
				// delete the node after the node that prev references
				Node curr = prev.next;
				prev.next = curr.next;
			}
			numItems--;
		} else {
			throw new ListIndexOutOfBoundsException("List index out of bounds on remove");
		}
	}  // end remove

	public void removeAll() {
		// setting head to null causes list to be 
		// unreachable and marked for garbage collection
		head = null;
		numItems = 0;
	} // end removeAll
	
	// This is a method I added to demonstrate internal identity referencing
	public void display() {
		Node curr = head;
		while(curr != null) {
			System.out.printf("%-22s %-22s %-22s\n", curr, curr.item, curr.next);
			curr = curr.next;
		}
	}
}