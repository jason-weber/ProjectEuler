//TODO SLOW!!!!!

import java.util.ArrayList;
public class Problem10 {

	public static ArrayList<Integer> primeList = new ArrayList<Integer>();
	public static void main(String[] args) {
		long beg = System.nanoTime();
		int max = 2000000;
		primeList.add(2);
		long sum = 2;
		for(int i = 3; i < max; i += 2){
			if(isPrime(i)){
				sum += i;
			}
		}
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 10: The sum of all primes under " +
				max + " is " + sum + " in " + time + " seconds.");

	}
	
	public static boolean isPrime(int num){
		for(int i = 0; i < primeList.size(); i++){
			if(num % primeList.get(i).intValue() == 0){
				return false;
			}
		}
		primeList.add(num);
		return true;
	}

}
