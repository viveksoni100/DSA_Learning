package recursion;

public class Factorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		int result = f.calculateFactorial(5);
		System.out.println(result);
	}

	public int calculateFactorial(int n) {
		if (n < 1) {	// step - 3 : unintentional cas - the constraint
			return -1;
		}
		if (n == 0 || n == 1) { // step - 2 : base case (stoping criteria)
			return 1;
		} else {
			return n * calculateFactorial(n - 1); // step - 1 : recursive case : n! = n*(n-1)!
		}
	}
}
