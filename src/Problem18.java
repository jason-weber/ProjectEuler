import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Problem18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long beg = System.nanoTime();
		int[][] triangle = {
				{75}, 
				{95, 64}, 
				{17, 47, 82},
				{18, 35, 87, 10}, 
				{20, 4, 82, 47, 65}, 
				{19, 1, 23, 75, 3, 34}, 
				{88, 2, 77, 73, 7, 63, 67},
				{99, 65, 4, 28, 6, 16, 70, 92},
				{41, 41, 26, 56, 83, 40, 80, 70, 33},
				{41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
				{53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
				{70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
				{91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
				{63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
				{4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23} };
		int depth = triangle.length - 2;
		
		while(depth >= 0){
			for(int i = 0; i <= depth; i++){
				triangle[depth][i] += Math.max(triangle[depth + 1][i], triangle[depth + 1][i + 1]);
			}
			depth -= 1;
		}
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 18: The max total from the top to bottom of the triangle is " + 
				triangle[0][0] + " in " + time + " seconds.");
	}
}
