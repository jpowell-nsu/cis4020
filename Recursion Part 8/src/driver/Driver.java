package driver;

public class Driver {
	
	public static void main(String[] args) {
		int answer;
		int n = 100000;
		
		//answer = f(n);
		//System.out.printf("f(%d) = %d\n\n", n, answer);
		
		//answer = factorial(n);
		//System.out.printf("factorial(%d) = %d\n\n", n, answer);
		
		//answer = fibonacci(n);
		//System.out.printf("fibonacci(%d) = %d\n\n", n, answer);
		// 1 1 2 3 5
		
		//answer = Sum(n);
		//System.out.printf("sum(%d) = %d\n\n", n, answer);
		
		answer = TowerMoves(n);
		System.out.printf("TowerMoves(%d) = %d\n\n", n, answer);
	}
	
	public static int f(int n) {
		System.out.print(n + " ");
		if (n == 1) {
			System.out.println("<-- " + n);
			return n;
		} else {
			System.out.println("--> ");
			int v = f(n-1);
			System.out.println(n + " <-- " + v);
			return v;
		}
	}
	
	public static int factorial(int n) {
		System.out.print(n + ", ");
		if (n == 0) {
			return 1;
		} else {
			int temp = factorial(n-1);
			System.out.println(n + "*" + temp);
			return n * temp;
		}
	}
	
	public static int fibonacci(int n) {
		System.out.print(n + ", ");
		if (n <= 2) {
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	public static int Sum(int n) {
		if (n == 0) {
			return 0;
		} else { // if (n > 0)
			return n + Sum(n-1);
		}
	}

	public static int TowerMoves(int n) {
		if (n == 1) {
			return 1;
		} else {
			return 2 * TowerMoves(n-1) + 1;
		}
	}
	
}
