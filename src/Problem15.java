
public class Problem15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Works only on square grids
		long beg = System.nanoTime();
		int sideLength = 20; 
		int moves = 40; // Number of squares in the grid.
		
		if(sideLength > (moves - sideLength)){
			sideLength = moves - sideLength;
		}
		
		long result = 1;
		for(int i = 0; i < sideLength; i++){
			result = result * (moves - i);
			result = result / (i + 1);
		}
		
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 15: The number of routes in a " + 
				sideLength + "X" + sideLength + " grid is " + result +
				" in " + time + " seconds.");	

	}

}
