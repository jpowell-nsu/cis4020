package bst;

public class BST<T extends KeyedItem<KT>, KT extends Comparable<? super KT>> {

	private Node<T> root;
	
	public BST() {
		root = null;
	}
	
	public BST(T item) {
		root = new Node<T>(item);
	}
	
	public BST(T item, Node<T> left, Node<T> right) {
		root = new Node<T>(item, left, right);
	}

	public boolean isEmpty() {
		return (root == null);
	}
	
	public void removeAll() {
		root = null;
	}
	
	public T peekRoot() {
		if(root == null) {
			throw new BSTException("BST Exception: Empty Tree");
		} else {
			return root.item;
		}
	}
	
	public void add(T item) {
		root = insert(root, item); // begin inserting process
	}
	
	private Node<T> insert(Node<T> tn, T item) {
		if(tn == null) { // position found
			tn = new Node<T>(item);// create the new node
		} else {
			Node<T> newSubtree;
			T nodeItem = tn.item;
			// search for the insertion point
			if(item.getKey().compareTo(nodeItem.getKey()) < 0) {
				// search left
				//System.out.println(item  + " " + "left");
				newSubtree = insert(tn.left, item);
				tn.left = newSubtree;
			} else {
				// search right
				//System.out.println(item  + " " + "right");
				newSubtree = insert(tn.right, item);
				tn.right = newSubtree;
			}
		}
		return tn;
	}
	
	public void remove(KT searchKey) {
		root = delete(root, searchKey);
	}
	
	private Node<T> delete(Node<T> tn, KT searchKey) {
		Node<T> newSubtree;
		
		if(tn == null) {
			throw new BSTException("BST Exception: Item Not Found");
		} else {
			T item = tn.item;
			if(searchKey.compareTo(item.getKey()) == 0) {
				tn = deleteNode(tn);
			} else if(searchKey.compareTo(item.getKey()) < 0) {
				// search left
				newSubtree = delete(tn.left, searchKey);
				tn.left = newSubtree;
			} else {
				// search right
				newSubtree = delete(tn.right, searchKey);
				tn.right = newSubtree;				
			}
		}
		return tn;
	}
	
	private Node<T> deleteNode(Node<T> tn) {
		if(tn.left == null && tn.right == null) {
			// case 1: node is a leaf
			return null;		
		} else if (tn.left == null) {
			// case 2: no left child
			return tn.right;
		} else if (tn.right == null ) {
			// case 3: no right child
			return tn.left;		
		} else {
			// case 4: two children
			//	note: go right once before it goes left
			T replacement = inorderSuccessor(tn.right);	
			tn.item = replacement;
			tn.right = deleteInorderSuccessor(tn.right);
			return tn;
		}
	}
	
	private T inorderSuccessor(Node<T> tn) {
		if(tn.left == null) {
			return tn.item; // the replacement item
		} else {
			return inorderSuccessor(tn.left);
		}
	}
	
	private Node<T> deleteInorderSuccessor(Node<T> tn) {
		if(tn.left == null) {
			return tn.right;
		} else {
			tn.left = deleteInorderSuccessor(tn.left);
			return tn;
		}
	}
	
	public T search(KT searchKey) {
		// retrieve method return a node
		// ().item then returns the item in the node
		return retrieve(root, searchKey).item;
	}
	
	private Node<T> retrieve(Node<T> tn, KT searchKey) {
		if(tn == null) {
			return null;
		} else {
			T item = tn.item;
			if(searchKey.compareTo(item.getKey()) == 0) {
				return tn;
			} else if(searchKey.compareTo(item.getKey()) < 0) {
				return retrieve(tn.left, searchKey);
			} else {
				return retrieve(tn.right, searchKey);
			}
		}
	}
	
	public void inorder() {
		// to be implemented 
	}
	
}  // end BinarySearchTree