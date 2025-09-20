package queue;

public interface QueueInterface<T> {

	  public boolean isEmpty();

	  public void enqueue(T newItem) throws QueueException;

	  public T dequeue() throws QueueException;

	  public void dequeueAll();

	  public T peek() throws QueueException;
	  
}
