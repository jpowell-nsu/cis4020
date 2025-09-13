package queue;

public class Queue implements QueueInterface {
	
	private class Node {	
		Object item;
		Node next;

		Node(Object newItem) {
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

	public void enqueue(Object newItem) {
	    Node newNode = new Node(newItem);

	    if (isEmpty()) {
	      newNode.next = newNode;
	    } else {
	      newNode.next = back.next;
	      back.next = newNode;
	    }
	    back = newNode;
	}

	public Object dequeue() throws QueueException {
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

	public Object peek() throws QueueException {
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