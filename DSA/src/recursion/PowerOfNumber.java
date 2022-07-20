package recursion;

/**
 * input 5,3 output = 125 (5*5*5)
 * 
 * @author viveksoni100
 *
 */
public class PowerOfNumber {

	public static void main(String[] args) {
		PowerOfNumber number = new PowerOfNumber();
		int resut = number.calculatePowerOfNumber(2, 5);
		System.out.println(resut);
	}

	private int calculatePowerOfNumber(int base, int exponential) {
		if (exponential == 0) {
			return 1;
		}
		return base * calculatePowerOfNumber(base, exponential - 1);
	}
}
