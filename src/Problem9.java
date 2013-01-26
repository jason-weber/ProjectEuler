public class Problem9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long beg = System.nanoTime();
		int goal = 1000;
		long result = findTripletProduct(goal);
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 9: The triplet that added together equals 1000 is " + result + 
				" in " + time + " seconds.");
	}
	
	public static long findTripletProduct(int goal){
		for(int i = 2; i < Integer.MAX_VALUE; i++){
			for(int j = 1; j < i; j++){
				int a = i * i - j * j;
				int b = 2 * i * j;
				int c = i * i + j * j;
				if( goal % (a + b + c) == 0){
					int constant = goal / (a + b + c);
					return constant * a * constant * b * constant * c;
				}
			}
		}
		return -1;
	}
}
