import java.util.HashMap;
import java.util.Map;


public class Problem21 {

	
	public static void main(String[] args) {
		long beg = System.nanoTime();
		int max = 10000;
		long amiSum = 0;
		for(int i = 1; i <= 10000; i++){
			int temp = sumDivisors(i);
			int temp2 = sumDivisors(temp);
			if(temp2 == i && i != temp){
				amiSum += i;
			}
		}
		
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 21: The sum of all amicable numbers under " + 
				max + " is " + amiSum + " in " + time + " seconds.");
	}
	
	private static int sumDivisors(int num){
		int sum = 0;
		for(int i = 1; i < (num / 2) + 1; i++){
			if(num % i == 0){
				sum += i;
			}
		}
		return sum;
	}
}
