package driver;

import java.util.Arrays;
import stack.Stack;

public class Driver {

	public static void main(String[] args) {
		Stack stack = new Stack();
		int[] values = {4, 5, 2, 25};
		//int[] values = {13, 7, 6, 12};
		//int[] values = {4, -3, 2, -1};
		
		int[] nge = new int[values.length];

		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.toString(nge));
		System.out.println();
/*
		for(int i = 0; i < values.length; i++) {
			int j;
			for(j = i+1; j < values.length && values[j] <= values[i]; j++) {
				;
			}
			if(j < values.length) {
				nge[i] = values[j];
			} else {
				nge[i] = -1;
			}
		}
*/
		
		for (int i = values.length-1; i >= 0; i--) {
			while(!stack.isEmpty() && (Integer) stack.peek() <= values[i]) {
				stack.pop();
			}
			
			if(!stack.isEmpty()) {
				nge[i] = (Integer) stack.peek();
			} else {
				nge[i] = -1;
			}
			
			stack.push(values[i]);
			stack.display();
		}
		System.out.println();
		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.toString(nge));
		stack.display();
	}

}
