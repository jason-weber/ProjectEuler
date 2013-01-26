
public class Problem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long beg = System.nanoTime();
		int sumOfSquares = 0;
		int squareOfSums = 0;
		int start = 1;
		int end = 100;
		for(int i = start; i <= end; i++){
			sumOfSquares += (int)Math.pow(i, 2);
		}
		for(int i = start; i <= end; i++){
			squareOfSums += i;
		}
		squareOfSums = (int)Math.pow(squareOfSums, 2);
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 6: The difference between the sum of squares from " +
					start + " to " + end + " is " + (squareOfSums - sumOfSquares) + 
					" in " + time + " seconds.");
	}

}
