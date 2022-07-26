package recursion;

public class SumOfDigits {

	/**
	 * 11 = 2, 112 = 4
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		SumOfDigits sumOfDigits = new SumOfDigits();
		int result = sumOfDigits.calculateSumOfDigits(-12);
		System.out.println(result);
	}

	public int calculateSumOfDigits(int n) {
		if (n == 0 || n < 0) { // base condition and unintentional case
			return 0;
		}
		return n % 10 + calculateSumOfDigits(n / 10); // recursive case
	}

}
