package driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

import bst.BinarySearchTree;

public class Driver {

	public static void main(String args[]) throws FileNotFoundException {
		Scanner scnr = new Scanner(new File("files/short.txt"));
		BinarySearchTree<Item<String>, String> bst = new BinarySearchTree<Item<String>, String>();

		while (scnr.hasNext()) {
			String vin = scnr.next();
			String model = scnr.next();
			String make = scnr.next();
			int year = scnr.nextInt();
			Item<String> item = new Item<String>(vin, year, make, model);
			System.out.println(item);
			//bst.add(item);
		}
		scnr.close();
		
		//LinkedList<Item<String>> traversal = bst.traversal("inorder");
		//System.out.println(traversal);
	}	
	
}
