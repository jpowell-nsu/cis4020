package driver;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// I encourage you to also look up iterative solutions of binary search

public class Driver {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();		
		int size = 25;
		int[] values = new int[size];
		int n;
		
		for (int i = 0; i < values.length; i++) {
			values[i] = rand.nextInt(100);
		}
		Arrays.sort(values);
		System.out.println(Arrays.toString(values));
		System.out.print("Enter the search value: ");
		n = scnr.nextInt();
		scnr.close();
		
		System.out.println("Element #" + binarySearch_me(values, n, 0, values.length-1));
		
		System.out.println("Element #" + binarySearch_GFG(values, n, 0, values.length-1));
		
		System.out.println("Element #" + binarySearch_chatGPT(values, n, 0, values.length-1));

	}
	
	// My quick attempt to code it from memory (maybe 10 minutes?)
	// It appears to work, but are there any errors? Let me know if you find any...
	public static int binarySearch_me(int[] array, int n, int first, int last) {
		System.out.println(first + " " + last);
		int mid = (first + last)/2;
		if (array[mid] == n) {
			return mid;
		} else if (first >= last) {
			return -1;
		} else if (array[mid] > n) {
			return binarySearch_me(array, n, first, mid-1);
		}
		// else if (array[mid] < n)
		return binarySearch_me(array, n, mid+1, last);

	}
	
	// Slight adaptation from Geeks for Geeks
	// Are there any errors? Let me know...
	// Is it better than mine? Let me know what you think...
	public static int binarySearch_GFG(int[] array, int n, int first, int last) {
		System.out.println(first + " " + last);
		if (last >= first && first <= array.length-1) {
			int mid = (first + last)/2;
		
			if (array[mid] == n) {
				return mid;
			}
			
			if (array[mid] > n) {
				return binarySearch_GFG(array, n, first, mid-1);
			}
			
			// if array[mid] < n
			return binarySearch_GFG(array, n, mid+1, last);
		}

		return -1;
	}
	
	// Slight adaptation from chatGPT
	// Are there any errors? Let me know...
	// Is it better than mine? Let me know what you think...
	public static int binarySearch_chatGPT(int[] arr, int key, int left, int right) {
		System.out.println(left + " " + right);
		if (left > right) {
			return -1; // Base case: not found
		}

		int mid = left + (right - left) / 2;

		if (arr[mid] == key) {
			return mid; // Found
		} else if (arr[mid] > key) {
			return binarySearch_chatGPT(arr, key, left, mid-1); // Search left half
		} else {
			return binarySearch_chatGPT(arr, key, mid+1, right); // Search right half
		}
    }

}
