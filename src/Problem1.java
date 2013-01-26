
public class Problem1 {
	public static void main(String[] args){
		long beg = System.nanoTime();
		int sum = 0;
		int max = 1000;
		for(int i = 3; i < max; i++){
			if(i % 3 == 0 || i % 5 == 0){
				sum += i;
			}
		}
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 1: The sum of all multiples of 3 and 5 less than " + 
				max + " is " + sum + " in " + time + " seconds.");
	}
}
