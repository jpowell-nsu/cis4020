package bst;

import java.util.LinkedList;
import java.util.Queue;

import searchkeys.KeyedItem;

public class BinarySearchTree <T extends KeyedItem<KT>, KT extends Comparable<? super KT>> {
	
	// do not change the access modifiers on data members or methods
	private Node<T> root; 
	private Queue<Node<T>> queue;
	private LinkedList<T> list;
	
	public BinarySearchTree() {
		root = null;
		queue = new LinkedList<Node<T>>();
		list = new LinkedList<T>();
	}
	
	public BinarySearchTree(T item) {
		root = new Node<T>(item);
		queue = new LinkedList<Node<T>>();
		list = new LinkedList<T>();
	}
	
	public BinarySearchTree(T item, Node<T> left, Node<T> right) {
		root = new Node<T>(item, left, right);
		queue = new LinkedList<Node<T>>();
		list = new LinkedList<T>();
	}
		
	public boolean isEmpty() {
		return (root == null);
	}
	
	public void removeAll() {
		root = null;
	}
	
	public T peekRoot() throws BSTException {
		if(root == null) {
			throw new BSTException("BST Exception: Empty Tree");
		} else {
			return root.item;
		}
	}
	
	public void add(T item) {
		root = insert(root, item);
	}

	public void remove(KT searchKey) throws BSTException {
		root = delete(root, searchKey);
	}
	
	public T search(KT searchKey) {
		// retrieve method returns a node, so we need to return the item
		return retrieve(root, searchKey).item;
	}
	
	private Node<T> insert(Node<T> tn, T item) {
		// to be implemented
		return null;
	}
	
	private Node<T> delete(Node<T> tn, KT searchKey) throws BSTException {
		// to be implemented
		return null;
	}	

	private Node<T> deleteNode(Node<T> tn) {
		// to be implemented
		return null;
	}
	
	private T inorderSuccessor(Node<T> tn) {
		// to be implemented
		return null;
	}
	
	private Node<T> deleteInorderSuccessor(Node<T> tn) {
		// to be implemented
		return null;
	}
		
	private Node<T> retrieve(Node<T> tn, KT searchKey) {
		// to be implemented
		return null;
	}	
	
	public LinkedList<T> traversal(String type) {
		// to be implemented
		if (type.equals("preorder")) {
			
		} else if (type.equals("inorder")) {
			
		} else if (type.equals("postorder")) {
			
		} else if (type.equals("breadthfirst")) {

		}
		return list;
	}

	private void preorder(Node<T> tn) {
		// to be implemented
	}
	
	private void inorder(Node<T> tn) {
		// to be implemented
	}
	
	private void postorder(Node<T> tn) {
		// to be implemented 
	}
	
	private void BFT() {
		// to be implemented 
	}

	public int size() {
		// to be implemented
		
		return 0;
	}
	
	public int levels() {
		// to be implemented
		
		return 0;
	}
	
	public T max() {
		T max = null;
		// to be implemented
		
		return max;
	}
	
	public T min() {
		T min = null;
		// to be implemented
		
		return min;
	}
	
	public void rottenTree() {
		
	}
	
	public LinkedList<T> range(KT low, KT high) {

		range(low, high, root);
		
		return list;
	}
	
	private void range(KT low, KT high, Node<T> tn) {
		// to be implemented
	}
		
}
