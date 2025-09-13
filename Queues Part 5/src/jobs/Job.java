package jobs;

public class Job<T, U> {
	
	private T ID;
	private U Info;
	
	public Job(T ID, U Info) {
		this.ID = ID;
		this.Info = Info;
	}
	
	public T getID() {
		return ID;
	}
	
	public void setID(T iD) {
		ID = iD;
	}
	
	public U getInfo() {
		return Info;
	}
	
	public void setInfo(U info) {
		Info = info;
	}
	
	@Override
	public String toString() {
		return ("(" + ID + ", " + Info + ")");
	}

}
