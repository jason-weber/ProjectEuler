//TODO SLOW!!!
public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long beg = System.nanoTime();
		int start = 2;
		int end = 20;
		for(int i = 2; true; i+=2){
			if(isDivisible(i, start, end)){
				double time = (System.nanoTime() - beg) / 1000000000.0;
				System.out.println("Problem 5: The least common multiple of " + 
						start + " to " + end + " is " + i + " in " + time + " seconds.");
				return;
			}
		}
	}
	
	public static boolean isDivisible(int num, int start, int end){
		for(int i = start; i <= end; i++){
			if(num % i != 0){
				return false;
			}
		}
		return true;
	}

}
