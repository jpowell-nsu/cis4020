package stack;

public class Stack implements StackInterface {

	private Node top;

	public Stack() {
		top = null;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void push(Object newItem) {
		top = new Node(newItem, top);
	}

	public Object pop() throws StackException {
		if (!isEmpty()) {
			Node temp = top;
			top = top.next;
			return temp.item;
		} else {
			throw new StackException("StackException on pop: stack empty");
		}
	}

	public void popAll() {
		top = null;
	}

	public Object peek() throws StackException {
		if (!isEmpty()) {
			return top.item;
		} else {
			throw new StackException("StackException on peek: stack empty");
		}
	}
	
	public void display() {
		display(top);
		System.out.println();
	}  
	
	private void display(Node n) {
		if (n == null) {
			System.out.print("Base [");
		} else {
			display(n.next);
			System.out.printf("(%s) ", n.item);
		}
	}
	
	public void displaWithIdentities() {
		Node hare = top;
			
		System.out.printf("%-24s|%-12s|%-24s\n", "NODE", "ITEM", "NEXT");
		while (hare != null) {
			System.out.printf("%-24s|%-12s|%-24s\n", hare, hare.item, hare.next);
			hare = hare.next;
		}
	}
}