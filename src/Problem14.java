//TODO SLOW!!!!


public class Problem14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long beg = System.nanoTime();
		int max = 1000000;
		int maxLength = 1;
		int result = 1;
		for(int i = 2; i <= max; i++){
			long curNum = i;
			int curLength = 0;
			while(curNum > 1){
				curLength++;
				if(curNum % 2 == 0){
					curNum = curNum / 2;
				}
				else{
					curNum = 3 * curNum + 1;
				}
			}
			if(curLength > maxLength){
				maxLength = curLength;
				result = i;
			}
		}
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 14: The longest Collatz sequence with a starting number less than " +
					max + " is " + result + " with a length of " + maxLength + " in " + time + " seconds.");
	}

}
