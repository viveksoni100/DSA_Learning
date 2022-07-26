package recursion;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		
		DecimalToBinary toBinary = new DecimalToBinary();
		int result = toBinary.convertDecimalToBinary(13);
		System.out.println(result);
	}

	private int convertDecimalToBinary(int n) {
		// TODO Auto-generated method stub
		if (n != 0) {	// base condition
			return n%2 + 10 *convertDecimalToBinary(n/2); // recursive case			
		} else {
			return 0;
		}
	}

}
