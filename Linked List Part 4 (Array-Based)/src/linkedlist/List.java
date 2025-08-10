package linkedlist;

/*********************************************************
Array-based implementation of the ADT list. This code is 
a slight modification to the book's code.
**********************************************************/
public class List implements ListInterface {

	private final int MAX_LIST = 50;  	// max array size
	private Object items[];  	 		// array list data
	private int numItems;  		 		// # of items in list
	
	public List() {
		items = new Object[MAX_LIST];
		numItems = 0;
	} // end default constructor

	public boolean isEmpty() {
		return (numItems == 0);
	} // end isEmpty

	public int size() {
		return numItems;
	} // end size

	public void removeAll() {
		// Creates a new array; marks old array for garbage collection.
		items = new Object[MAX_LIST];
		numItems = 0;
	} // end removeAll

	public void add(int index, Object item) throws ListIndexOutOfBoundsException {
		// check size of list
		if(numItems > MAX_LIST) {
			throw new ListException("ListException on add");
		}
		//insert the item
		if(index >= 0 && index <= numItems) {
			// make room for new element by shifting right
			// all positions that are >= index (no shift if index == numItems+1)
			for(int pos = numItems; pos >= index; pos--) {
				items[pos+1] = items[pos];
			}
			// insert new item
			items[index] = item;
			numItems++;
		} else {  // index out of range
			throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on add");
		}
	} //end add

	public Object get(int index) throws ListIndexOutOfBoundsException {
		if(index >= 0 && index < numItems) {
			return items[index];
		} else  {  // index out of range
			throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on get");
		}
	} // end get

	public void remove(int index) throws ListIndexOutOfBoundsException {
		if(index >= 0 && index < numItems) {
			// delete item by shifting left all 
			// positions > index (no shift if index == size)
			for(int pos = index+1; pos <= size(); pos++) {
				items[pos-1] = items[pos];
			}
			numItems--;
		} else {  // index out of range
			throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on remove");
		} 
	} // end remove
	
} // end ListArrayBased
