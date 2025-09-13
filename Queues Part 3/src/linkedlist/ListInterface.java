package linkedlist;

public interface ListInterface {

	public boolean isEmpty();

	public int size();
	
	public void add(int index, Object item) throws ListIndexOutOfBoundsException;
	
	public void remove(int index) throws ListIndexOutOfBoundsException;
	
	public Object get(int index) throws ListIndexOutOfBoundsException;
	
	public void removeAll();
	
}
