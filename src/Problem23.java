
public class Problem23 {

	public static boolean[] isAbundant = new boolean[28124];
	public static void main(String[] args) {
		long beg = System.nanoTime();
		for(int i = 1; i < isAbundant.length; i++){
			isAbundant[i] = isAbundant(i);
		}
		
		int sum = 0; 
		for(int i = 1; i <= 28123; i++){
			if(!isSumOfAbundants(i)){
				sum += i;
			}
		}
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 23: The sum of numbers that are not sums of 2 abundants is " +
				sum + " in " + time + " seconds.");

	}
	
	public static boolean isAbundant(int n){
		int sum = 1;
		double stop = Math.sqrt(n);
		for(int i = 2; i <= stop; i++){
			if(( n % i ) == 0){
				sum += i + n/ i;
			}
		}
		if((int)stop * (int)stop == n){
			sum -= stop;
		}
		return sum > n;
	}
	
	public static boolean isSumOfAbundants(int n){
		for(int i = 0; i <= n; i++){
			if(isAbundant[i] && isAbundant[n-i]){
				return true;
			}
		}
		return false;
	}

}
