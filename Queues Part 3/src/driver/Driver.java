package driver;

import java.util.Scanner;

import droids.Droid;
import queue.Queue;

public class Driver {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Queue queue = new Queue();
		Integer value;

		// 18 10 5 100 19 3 12
		System.out.print("Enter 7 ints: ");
		for(int i = 0; i < 7; i++) {
			value = scnr.nextInt();
			queue.enqueue(value);
			queue.display();
		}
		scnr.close();		
		
		value = (Integer) queue.dequeue();
		System.out.println(value);
		queue.dequeue();
		queue.enqueue(100100);
		queue.dequeue();
		Droid droid = new Droid("R2-D2");
		queue.enqueue(droid);
		droid = new Droid("R5-D4");
		queue.enqueue(droid);
		queue.dequeue();
		queue.enqueue(73);
		queue.dequeue();
		droid = new Droid("BB-8");
		queue.enqueue(droid);
		queue.dequeue();
		queue.dequeue();
		droid = new Droid("C-3PO");
		queue.enqueue(droid);
		queue.enqueue(42);
		droid = new Droid("R5-D4");
		queue.enqueue(droid);
		queue.display();

		while (!queue.isEmpty()) {
			if (queue.peek() instanceof Integer) {
				System.out.println("Integer");
				queue.dequeue();
			} else if(queue.peek() instanceof Droid) {
				System.out.println("Droid");
				queue.dequeue();
			} else {
				System.out.println("Unknown");
				queue.dequeue();
			}
		}
		queue.display();
		System.out.println();
	}

}
