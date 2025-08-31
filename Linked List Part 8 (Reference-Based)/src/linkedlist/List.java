package linkedlist;


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

	public void experiment() {
		Node first = new Node(null, 1, null);
		Node second = new Node(first, 2, null);
		Node third = new Node(second, 3, null);
		first.next = second;
		second.next = third;
		head = first;
	}
	
	public void display() {
		Node hare = head;
		Node turtle = null;
				
		System.out.printf("%-24s|%-24s|%-12s|%-24s\n", "NODE", "PREVIOUS", "ITEM", "NEXT");
		while (hare != null) {
			System.out.printf("%-24s|%-24s|%-12s|%-24s\n", hare, hare.prev, hare.item, hare.next);
			turtle = hare;
			hare = hare.next;
		}
		
		System.out.printf("------------------------------------------------------------------------------\n");
		System.out.printf("%-24s|%-24s|%-12s|%-24s\n", "NODE", "PREVIOUS", "ITEM", "NEXT");
		while (turtle != null) {
			System.out.printf("%-24s|%-24s|%-12s|%-24s\n", turtle, turtle.prev, turtle.item, turtle.next);
			turtle = turtle.prev;
		}
		
	}

	public void removeAll() {
		head = null;	// causes list to be unreachable and marked for garbage collection
		numItems = 0;
	} // end removeAll

	public void add(int index, Object item) throws ListIndexOutOfBoundsException {
		// TODO Auto-generated method stub

	}
	
	public void remove(int index) throws ListIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
	}

	public Object get(int index) throws ListIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

}