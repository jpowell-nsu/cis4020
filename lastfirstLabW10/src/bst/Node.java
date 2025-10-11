package bst;

public class Node<T> {
	
	protected T item;			// do not change from protected
	protected Node<T> left;		// do not change from protected
	protected Node<T> right;	// do not change from protected

	public Node(T item) {
		this.item = item;
		this.left  = null;
		this.right = null;
	}

	public Node(T item, Node<T> left, Node<T> right) {
		this.item = item;
		this.left = left;
		this.right = right;
	}	

}
