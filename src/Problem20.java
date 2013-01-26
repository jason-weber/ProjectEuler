import java.math.BigInteger;


public class Problem20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long beg = System.nanoTime();
		BigInteger num = factorial(BigInteger.valueOf(100));
		int sum = 0;
		String snum = num.toString();
		for(int i = 0; i < snum.length(); i++){
			sum += Character.getNumericValue(snum.charAt(i));
		}
		
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 20: The sum of all the digits is " +
				sum + " in " + time + " seconds.");

	}
	
	private static BigInteger factorial(BigInteger n){
		if(n.compareTo(BigInteger.valueOf(2)) == -1){
			return BigInteger.ONE;
		}
		else{
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
		}
	}
}
