package driver;

import java.util.Random;
import bst.BST;
import items.Droid;
import items.Item;
import items.Person;

public class Example {
	
	public static void main(String args[]) {
		Random rand = new Random();
		
		BST<Item, Integer> items = new BST<Item, Integer>();
		BST<Droid, String> droids = new BST<Droid, String>();
		BST<Person, Integer> people = new BST<Person, Integer>();
		
		for(int i = 0; i < 100; i++) {
			int temp = rand.nextInt(100);
			Item item = new Item(temp, temp);
			items.add(item);
		}
		items.inorder();
		System.out.println();
		
		Droid d = new Droid("IG-88");
		droids.add(d);
		d = new Droid("R2-D2");
		droids.add(d);
		d = new Droid("B1");
		droids.add(d);
		d = new Droid("IT-O");
		droids.add(d);
		d = new Droid("BB-8");
		droids.add(d);		
		droids.inorder();
		System.out.println();
		
		Person p = new Person(4, "Black Widow", "867-5309");
		people.add(p);
		p = new Person(5, "Captain America", "606-0842");
		people.add(p);
		p = new Person(3, "Iron man", "777-9311");
		people.add(p);
		p = new Person(2, "Hulk", "489-4608");
		people.add(p);
		p = new Person(6, "Thor", "853-3937");
		people.add(p);
		p = new Person(1, "Ant-man", "842-3089");
		people.add(p);
		people.inorder();
		System.out.println();
		people.remove(3);
		people.inorder();
		System.out.println();
		people.remove(1);
		people.inorder();
		System.out.println();
		people.remove(5);
		people.inorder();
		System.out.println();
		people.remove(4);
		people.inorder();
		System.out.println();
		people.remove(2);
		people.inorder();
		System.out.println();
		people.remove(6);
		people.inorder();
		System.out.println();

	}
}
