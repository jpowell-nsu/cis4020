package items;

import bst.KeyedItem;

public class Item extends KeyedItem<Integer> {
	
	// This class will hold an integer
	// but it will still need a key value.
	
	// If we set the data and key to same value,
	// then we have to be careful and not change
	// data without also changing the key. And
	// if we do change things, it may affect
	// the position in the tree, i.e. you have
	// may have move it in the tree. BST is easy
	// enough with a delete and insert operation.
	
	private Integer data;
	
	// must have a constructor that assigns a
	// value to the key (inheritance rules apply)
	public Item(Integer key, Integer data) {
		super(key);
		this.data = data;
	}
	
	public Integer get() {
		return data;
	}

	@Override
	public String toString() {
		return Integer.toString(data);
	}
}
