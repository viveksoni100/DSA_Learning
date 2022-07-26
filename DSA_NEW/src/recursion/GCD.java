package recursion;

/**
 * input 8, 4
 * output 4
 * explanation :
 * 8 = 2 * 2 * 2
 * 4 = 2 * 2
 * first two times 2 are common so 2*2 = 4
 * @author viveksoni100
 *
 */
public class GCD {

	public static void main(String[] args) {
		GCD gcd = new GCD();
		int result = gcd.calculateGCD(8, 4);
		System.out.println(result);
	}

	private int calculateGCD(int a, int b) {
		// TODO Auto-generated method stub
		if (a<0 || b<0) {
			return -1;	// unintentional condition
		}
		if (b != 0) {	// base condition
			return calculateGCD(b, a % b); // recursive condition - based on euclidean algorithm
		} else {
			return a;
		}
	}
}
