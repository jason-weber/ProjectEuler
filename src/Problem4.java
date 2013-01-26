
public class Problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long beg = System.nanoTime();
		int min = 100;
		int max = 999;
		String pal = "";
		int result = 0;
		for(int i = min; i <= max; i++){
			for(int j = min; j <= max; j++){
				pal = Integer.toString(i * j);
				if(pal.equals(new StringBuffer(pal).reverse().toString()) && i * j > result){
					result = i * j;
				}
			}
		}
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 4: The largest palindrome of a product from " + 
				min + " to " + max + " is " + result + " in " + time + " seconds.");
	}

}
