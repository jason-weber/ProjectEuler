//TODO SLOW!!!
import java.util.ArrayList;
public class Problem7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long beg = System.nanoTime();
		int indexOfPrime = 10001;
		ArrayList<Integer> primeList = new ArrayList<Integer>(indexOfPrime);
		primeList.add(2);
		for(int i = 3; primeList.size() < indexOfPrime; i+=2){
			if(Problem3.isPrime(i)){
				primeList.add(i);
			}
		}
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 7: The " + indexOfPrime + " prime number is " + primeList.get(indexOfPrime - 1) + 
				" in " + time + " seconds.");
	}

}
