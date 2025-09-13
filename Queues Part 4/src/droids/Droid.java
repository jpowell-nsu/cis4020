package droids;

public class Droid {

	private String name;
	
	public Droid(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "(" + this.name + ")";
	}
	
}
