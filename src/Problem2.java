
public class Problem2 {
	public static void main(String[] args){
		long beg = System.nanoTime();
		int fibNum = 0;
		int sum = 0;
		int max = 4000000;
		for(int i = 1; fibNum <= max; i++){
			fibNum = fib(i);
			if(fibNum % 2 == 0){
				sum += fibNum;
			}
		}
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 2: The sum of the even fibonacci numbers less than " +
				max + " is " + sum + " in " + time + " seconds.");
	}
	
	public static int fib(int n){
		if(n <=  1){
			return n;
		}
		else{
			return fib(n - 1) + fib(n - 2);
		}
	}
}
