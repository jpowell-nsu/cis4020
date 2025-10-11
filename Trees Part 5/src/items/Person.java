package items;

import bst.KeyedItem;

public class Person extends KeyedItem<Integer> {
	
	private String name;
	private String phone;
	
	public Person(Integer ID, String name, String phone) {
		super(ID);
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	@Override
	public String toString() {
		return (getKey() + " " + this.name + " " + this.phone);
	}

}
