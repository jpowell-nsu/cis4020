package driver;

import searchkeys.KeyedItem;

public class Item<KT> extends KeyedItem<KT> {
	
	public int year;
	public String model;
	public String make;

	public Item(KT VIN, int year, String make, String model) {
		super(VIN); // VIN is the key
		setYear(year);
		setModel(model);
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}	
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

}
