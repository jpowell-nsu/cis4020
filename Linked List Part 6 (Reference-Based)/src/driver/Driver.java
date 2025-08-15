package driver;

import java.util.Scanner;

import linkedlist.List;

public class Driver {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		List myList = new List();
		Integer value;
			
		// 18 10 5 100 19 3 12
		System.out.print("Enter 7 ints: ");
		for (int i = 0; i < 7; i++) {
			value = scnr.nextInt();
			myList.add(0, value); 				// adding at the head (element 0)
			//myList.add(myList.size(), value);		// add it at the end
		}
		scnr.close();

		myList.display();
		
		for (int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + " ");
		}
		System.out.println();
				
		value = 44;
		myList.add(2, value);	// add an item at index location 2
		for (int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + " ");
		}
		System.out.println();

		myList.remove(3); 
		for (int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + " ");
		}
		System.out.println();
		
		myList.removeAll();
		for (int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + " ");
		}
		System.out.println();
	}

}
