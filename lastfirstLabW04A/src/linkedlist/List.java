package linkedlist;

public class List implements ListInterface {
	
	private Node head;
	private int numItems;

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

	public void display() {
		Node curr = head;
		while(curr != null) {
			System.out.printf("%-24s|%-24s|%-24s\n", curr, curr.item, curr.next);
			curr = curr.next;
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
			Node curr = find(index);
			Object dataItem = curr.item;
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