import java.util.HashMap;
import java.util.Map;


public class Problem17 {

	public static Map<Integer, String> words= new HashMap<Integer, String>();
	
	public static void main(String[] args) {
		long beg = System.nanoTime();
		words.put(1, "one");
		words.put(2, "two");
		words.put(3, "three");
		words.put(4, "four");
		words.put(5, "five");
		words.put(6, "six");
		words.put(7, "seven");
		words.put(8, "eight");
		words.put(9, "nine");
		words.put(10, "ten");
		words.put(11, "eleven");
		words.put(12, "twelve");
		words.put(13, "thirteen");
		words.put(14, "fourteen");
		words.put(15, "fifteen");
		words.put(16, "sixteen");
		words.put(17, "seventeen");
		words.put(18, "eighteen");
		words.put(19, "nineteen");
		words.put(20, "twenty");
		words.put(30, "thirty");
		words.put(40, "forty");
		words.put(50, "fifty");
		words.put(60, "sixty");
		words.put(70, "seventy");
		words.put(80, "eighty");
		words.put(90, "ninety");
		words.put(100, "hundred");
		words.put(1000, "thousand");
		
		int max = 1000;
		String result = "";
		for(int i = 1; i <= max; i++){
			result += calc(i);
		}
		
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 17: The number of letters in the numbers from 1 to " +
				max + " is " + result.length() + " in " + time + " seconds.");
	}
	
	private static String calc(int num){
		int place = num / 100;
		String result = "";
		if(place > 0 && place < 10){
			result += words.get(place);
			result += words.get(100);
			if(num % 100 > 0){
				result += "and";
			}
		}
		
		result += tens(num % 100);
		if(num == 1000){
			result += words.get(1000);
			result += words.get(1);
		}
		return result;
	}
	
	private static String tens(int num){
		String result = "";
		if((num >= 20 && num <= 99) || num == 10){
			result += words.get(num / 10 * 10);
		}
		if(num >= 11 && num <= 19){
			result += words.get(num);
		}
		else if(num % 10 > 0 && num % 10 < 10){
			result += words.get(num % 10);
		}
		return result;
	}

}
