
public class Problem3 {
	public static void main(String[] args){
		long beg = System.nanoTime();
		long numToFactor = 600851475143L;
		long result = 0;
		
		
		for(long i = 3L; i * i< numToFactor / 2; i+=2){
			if(numToFactor % i == 0){
				if(isPrime(i)){
					result = i;
				}
			}
		}
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 3: The largest prime factor of " + numToFactor + 
				" is " + result + " in " + time + " seconds.");
	}
	
	public static boolean isPrime(long num){
		if(num % 2 == 0){
			return false;
		}
		else{
			for(long i = 3L; i < num /2; i+=2){
				if(num % i == 0){
					return false;
				}
			}
			return true;
		}
	}
}
