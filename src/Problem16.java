import java.math.BigInteger;


public class Problem16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long beg = System.nanoTime();
		int baseNum = 2;
		int power = 1000;
		BigInteger num = BigInteger.valueOf(baseNum);
		num = num.pow(power);
		int length = num.toString().length();
		int sum = 0;
		for(int i = 0; i < length; i++){
			sum += num.mod(BigInteger.valueOf(10)).intValue();
			num = num.divide(BigInteger.valueOf(10));
		}
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 16: The sum of the digits for " + 
				baseNum + " raised to " + power + " is " + sum + 
				" in " + time + " seconds.");
	}

}
