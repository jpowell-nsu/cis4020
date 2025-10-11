package bst;

class Node<T> {
	
	T item;
	Node<T> left;
	Node<T> right;

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