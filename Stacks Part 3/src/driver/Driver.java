package driver;

import java.util.Scanner;

import droids.Droid;
import stack.Stack;

public class Driver {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Stack stack = new Stack();
		Integer value;
		
		// 18 10 5 100 19 3 12
		System.out.print("Enter 7 ints: ");
		for(int i = 0; i < 7; i++) {
			value = scnr.nextInt();
			stack.push(value);
		}
		scnr.close();
		
		stack.displayIdentities();
		System.out.println();

		stack.display();
		value = (Integer) stack.pop();
		System.out.println(value);
		stack.display();
		stack.pop();
		stack.display();
		stack.push(100100);
		stack.display();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push(42);
		stack.display();
		stack.popAll();
		stack.display();
		//stack.pop();
		
		System.out.println();

		// ********************************************************
		// example with user-defined objects
		Stack droids = new Stack();

		Droid droid = new Droid("R2-D2");
		droids.push(droid);
		
		droid = new Droid("BB-8");
		droids.push(droid);
		
		droid = new Droid("C-3PO");
		droids.push(droid);
		
		droid = new Droid("R5-D4");
		droids.push(droid);
		
		droids.display();
		System.out.println();
		
		droid = (Droid) droids.peek();
		System.out.println("Peek: " + droid.getName());
		
		System.out.println();
		droids.display();
		
		while(!droids.isEmpty()) {
			droid = (Droid) droids.pop();
			System.out.println(droid.getName());
		}
		System.out.println();
		droids.display();
	}

}
