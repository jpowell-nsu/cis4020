package driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import jobs.Job;
import queue.Queue;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		Queue<Job<Integer, Double>> transaction = new Queue<>(); 
		Queue<Job<Integer, String>> processor = new Queue<>();
		File file;
		Scanner fscnr;
		String[] information;
		
		// TRANSACTIONS
		file = new File("files/transactions.csv");
		fscnr = new Scanner(file);
		fscnr.nextLine();
		information = fscnr.nextLine().split(",");
		while (fscnr.hasNext()) {
			information = fscnr.nextLine().split(",");
			Job<Integer, Double> job = new Job<>(
					Integer.parseInt(information[0]),
					Double.parseDouble(information[1]));
			transaction.enqueue(job);
		}
		fscnr.close();
		transaction.display();
		
		// PROCESSES
		file = new File("files/processes.csv");
		fscnr = new Scanner(file);
		fscnr.nextLine();
		information = fscnr.nextLine().split(",");
		while (fscnr.hasNext()) {
			information = fscnr.nextLine().split(",");
			Job<Integer, String> job = new Job<>(
					Integer.parseInt(information[0]),
					information[1]);
			processor.enqueue(job);
		}
		fscnr.close();
		processor.display();
	}

}
