package queue;

public class Queue<T> implements QueueInterface<T> {
	
	// Benefits of Generics
	//	Type safety at compile time - compiler enforces type constraints
	//	Eliminates manual casting - no longer requires casting down, making code cleaner and less error prone
	//	Improved code readability & self-documentation
	//		Queue<String> makes it clear what is in the queue
	//		Makes code cleaner and less error prone
	//	Reusability of Code
	//	Improved the JCF and how you can extend it
	
	private class Node {
		T item;
		Node next;

		Node(T newItem) {
			item = newItem;
			next = null;
		}

	}

	private Node back;

	public Queue() {
		back = null;
	}

	public boolean isEmpty() {
		return (back == null);
	}

	public void enqueue(T newItem) {
	    Node newNode = new Node(newItem);

	    if (isEmpty()) {
	      newNode.next = newNode;
	    } else {
	      newNode.next = back.next;
	      back.next = newNode;
	    }
	    back = newNode;
	}

	public T dequeue() throws QueueException {
		if (!isEmpty()) {
			Node front = back.next;
		    if (front == back) {
		    	back = null;
		    } else {
		        back.next = front.next;
		    } 
		    return front.item;
		} else {
			throw new QueueException("QueueException on dequeue: queue empty");
		} 
	}

	public void dequeueAll() {
		back = null;
	}

	public T peek() throws QueueException {
		if (!isEmpty()) {
			return back.next.item;
		} else {
			throw new QueueException("Queue exception on peek queue empty");
	    }
	}
	  
	public void display() {
		System.out.print("f<-[ ");
		if (back != null) {
			Node temp = back.next;
			while (temp != back) {
				System.out.print(temp.item + " ");
				temp = temp.next;
			}
			System.out.print(temp.item + " ");
		}
		System.out.println("]<-b");
	}
}