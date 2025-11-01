package driver;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import hashtable.HashTable;

public class Driver {

	public static void main(String args[]) throws IOException {
		File file = new File("files/duplicates.txt");
		Scanner input = new Scanner(file);
		HashTable table = new HashTable(500);
		
		System.out.print("Duplicates  : ");
		while(input.hasNext()) {
			int x = input.nextInt();

			System.out.println(input.nextInt());
		}
		System.out.println();
		input.close();	
	}
	
}
