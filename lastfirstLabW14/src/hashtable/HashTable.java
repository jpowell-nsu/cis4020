package hashtable;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class HashTable {
	
	private int size;
	private LinkedList<Integer>[] table;	// separate chaining table
	private int count;

	@SuppressWarnings("unchecked")
	public HashTable(int size) {
		this.table = new LinkedList[size];
		this.count = 0;
		this.size = size;
		
		for (int i = 0; i < this.table.length; i++) {
			this.table[i] = new LinkedList<>();
		}
	}
	
	private int h(int x) {
		
		return 0;
	}
	
	private boolean insert(int hx, int x) {

		return false;
	}
	
	private boolean delete(int hx, int x) {
		
		return false;
	}

	private double loadfactor() {
		
		return 0.0;
	}
	
	private double successful() {
		
		return 0.0;
	}
	
	private double unsuccessful() {
		
		return 0.0;
	}
	
	public boolean add(int x) {
		
		return false;
	}
	
	public boolean remove(int x) {
		
		return false;
	}
	
	public boolean find(int x) {
		
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public void clear() {

	}
	
	public void information() {
		System.out.printf("Table Size  : %5d\n", size);
		System.out.printf("Count       : %5d\n", count);
		System.out.printf("Load Factor : %5.2f\n", loadfactor());
		System.out.printf("Successful  : %5.2f\n", successful());
		System.out.printf("Unsuccessful: %5.2f\n", unsuccessful());
	}
	
	public void dump(String filename) throws IOException {
		FileWriter fw = new FileWriter(filename);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.close();
		fw.close();
	}
	
}
