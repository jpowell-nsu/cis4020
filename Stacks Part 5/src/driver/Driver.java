package driver;

import java.util.Arrays;
import stack.Stack;

public class Driver {

	public static void main(String[] args) {
		Stack stack = new Stack();
		Integer[] values = {4, 5, 2, 25};
		//Integer[] values = {1, 3, 2, 4};
		//Integer[] values = {6, 8, 0, 1, 3};
		//Integer[] values = {1, 2, 3, 4, 5};
		//Integer[] values = {5, 4, 3, 2, 1};
		
		Integer[] nge = new Integer[values.length];
		Arrays.fill(nge, -1);
		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.toString(nge));
		System.out.println();

		/*
        for (int i = 0; i < values.length; i++) {
            // check for the next greater element in the rest of the array
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] > values[i]) {
                    nge[i] = values[j];
                    break;  // sigh... >(ভ⤙ ভ ")<
                }
            }
        }
        */
  
		for (int i = values.length-1; i >= 0; i--) {
	        // Pop elements from the stack that are less than or equal to the current element
			while(!stack.isEmpty() && (Integer) stack.peek() <= values[i]) {
				stack.pop();
			}
			// If the stack is not empty, the top element is the next greater element
			if(!stack.isEmpty()) {
				nge[i] = (Integer) stack.peek();
			} else {
				nge[i] = -1;
			}
			// Push the current element onto the stack
			stack.push(values[i]);
			stack.display();
		}

		System.out.println();
		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.toString(nge));
		stack.display();
	}

}
