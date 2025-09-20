package jobs;

public class Droids<T, U> {
	
	private T ID;
	private U name;
	
	public Droids(T ID, U name) {
		this.ID = ID;
		this.name = name;
	}
	
	public T getID() {
		return ID;
	}
	
	public void setID(T iD) {
		ID = iD;
	}
	
	public U getInfo() {
		return name;
	}
	
	public void setInfo(U info) {
		name = info;
	}
	
	@Override
	public String toString() {
		return ("(" + ID + ", " + name + ")");
	}

}
