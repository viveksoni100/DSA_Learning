package recursion;

public class Fibonacci {

	public static void main(String[] args) {

		Fibonacci f = new Fibonacci();
		int result = f.calculateFibonacci(10);
		System.out.println(result);
	}

	private int calculateFibonacci(int n) {
		// TODO Auto-generated method stub
		if (n < 0) { // step - 3 : unintentional cas - the constraint
			return -1;
		}
		if (n == 0 || n == 1) { // step - 2 : base case (stoping criteria)
			return n;
		} else {
			return calculateFibonacci(n - 1) + calculateFibonacci(n - 2); // step - 1 : recursive case
		}

	}
}
