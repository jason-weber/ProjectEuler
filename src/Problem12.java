
public class Problem12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long beg = System.nanoTime();
		int numDivisors = 500;
		int curDivisors = 1;
		int triangleNum = 0;
		for(int i = 1; true; i++){
			triangleNum += i;
			curDivisors = findNumOfDivisors(triangleNum);
			if(curDivisors > numDivisors){
				double time = (System.nanoTime() - beg) / 1000000000.0;
				System.out.println("The first term with more than " + numDivisors + " divisors is " +
						triangleNum + " in " + time + " seconds.");
				return;
			}
		}
	}
	
	public static int findNumOfDivisors(int num){
		int result = 2;
		if(num % 2 == 0){
			result+=2;
		}
		int square = (int) Math.sqrt(num);
		for(int i = 3; i < square; i += 2){
			if(num % i == 0){
				result+=2;
			}
			if(num % (i + 1) == 0){
				result+=2;
			}
		}
		return result;
	}
}
