import java.util.ArrayList;


public class Problem24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long beg = System.nanoTime();
		int[] perm = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int N = perm.length;
		String permNum = "";
		int remain = 1000000 - 1;
		 
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
		    numbers.add(i);
		}
		 
		for (int i = 1; i < N; i++) {
		    int j = remain / factorial(N - i);
		    remain = remain % factorial(N - i);
		    permNum = permNum + numbers.get(j);
		    numbers.remove(j);
		    if (remain == 0) {
		        break;
		    }
		}
		 
		for (int i = 0; i < numbers.size(); i++) {
		    permNum = permNum + numbers.get(i);
		}
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 24: The millionth permutation is " + permNum + " is " + 
				time + " seconds.");

	}
	
	public static int factorial(int n){
		int result = 1;
		for(int i = n; i > 1; i--){
			result *= i;
		}
		return result;
	}

}
