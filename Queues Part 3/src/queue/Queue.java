package queue;

import linkedlist.List;

public class Queue implements QueueInterface {
	
	private List list;

	public Queue() {
		list = new List();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void enqueue(Object newItem) {
		list.add(list.size(), newItem);
	}

	public Object dequeue() throws QueueException {
		if (!isEmpty()) {
			Object queueFront = list.get(0);
			list.remove(0);
			return queueFront;
	    } else {
	    	throw new QueueException("Queue exception on dequeue: queue empty");
	    }
	}

	public void dequeueAll() {
		list.removeAll();
	}

	public Object peek() throws QueueException {
		if (!isEmpty()) {
			return list.get(0);
		} else {
			throw new QueueException("Queue exception on peek queue empty");
	    }
	}
	  
	public void display() {
		System.out.print("f<-[ ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("]<-b");
	}
}