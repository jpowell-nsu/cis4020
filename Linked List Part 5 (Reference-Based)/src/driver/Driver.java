package driver;

import java.util.Scanner;

import droids.Droid;
import linkedlist.List;

public class Driver {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		List myList = new List();
		Integer value;
		
		// 18 10 5 100 19 3 12
		System.out.print("Enter 7 ints: ");
		for(int i = 0; i < 7; i++) {
			value = scnr.nextInt();
			//myList.add(0, value); 					// adding at the head (element 0)
			myList.add(myList.size(), value);		// add it at the end
		}
		scnr.close();
		
		myList.display();
			
		for(int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + " ");
		}
		System.out.println();
		
		value = 44;
		myList.add(2, value);
		for(int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + " ");
		}
		System.out.println();
		
		myList.remove(3); 
		for(int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + " ");
		}
		System.out.println();
		
		myList.removeAll();
		for(int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + " ");
		}
		System.out.println();
		
		myList.add(0, 42);
		//myList.add(1, 42);
		for(int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + " ");
		}
		System.out.println();

		// ********************************************************
		// example with user-defined objects
		List droids = new List();
		
		Droid droid = new Droid("R2-D2");
		droids.add(droids.size(), droid);
		
		droid = new Droid("BB-8");
		droids.add(droids.size(), droid);
		
		droid = new Droid("C-3PO");
		droids.add(droids.size(), droid);
		
		droid = new Droid("R5-D4");
		droids.add(droids.size(), droid);
		
		droids.display();
		
		for(int i = 0; i < droids.size(); i++) {
			droid = (Droid) droids.get(i);	// here we cast the Object into Droid
			System.out.printf("%-22s %s\n", droids.get(i), droid.getName()); // now we get the name
		}
		System.out.println();		
	}

}
