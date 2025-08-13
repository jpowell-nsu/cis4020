package driver;

import droids.Droid;
import linkedlist.List;

public class DroidDriver {

	public static void main(String[] args) {
		List droids = new List();
		
		Droid droid = new Droid("R2-D2");
		droids.add(0, droid);
		
		droid = new Droid("BB-8");
		droids.add(0, droid);
		
		droid = new Droid("C-3PO");
		droids.add(0, droid);
		
		droid = new Droid("R5-D4");
		droids.add(0, droid);
		
		for (int i = 0; i < droids.size(); i++) {
			droid = (Droid) droids.get(i);	// here we cast the Object into Droid
			System.out.println(droid); // now we get the name
		}

		System.out.println();		
	}

}
