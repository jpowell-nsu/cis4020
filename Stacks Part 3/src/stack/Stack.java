package stack;

import linkedlist.List;

public class Stack implements StackInterface {

	private List list;
	
	public Stack() {
		list = new List();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void push(Object newItem) {
		list.add(0, newItem);
	}

	public Object pop() throws StackException {
		if (!list.isEmpty()) {
			Object temp = list.get(0);
			list.remove(0);
			return temp;
		} else {
			throw new StackException("StackException on pop: stack empty");
		}
	}

	public void popAll() {
		list.removeAll();
	}

	public Object peek() throws StackException {
		if (!isEmpty()) {
			return list.get(0);
		} else {
			throw new StackException("StackException on peek: stack empty");
		}
	}
	
	public void displayIdentities() {
		list.displayWithIdentities();
	}
  
	public void display() {
		System.out.print("Base [");
		for (int i = list.size()-1; i >= 0; i--) {
			//System.out.print(list.get(i).toString() + " ");
			System.out.printf("(%s) ", list.get(i));
		}
		System.out.println();
	}  
  
}
