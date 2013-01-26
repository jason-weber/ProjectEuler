import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Problem22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long beg = System.nanoTime();
		String[] names = readAndSort("res/names.txt");
		long totalNameScore = 0;
		for(int i = 0; i < names.length; i++){
			totalNameScore += (getNameScore(names, i));
		}
		double time = (System.nanoTime() - beg) / 1000000000.0;
		System.out.println("Problem 22: The total score for all names is " + totalNameScore + " in " + time + " seconds.");

	}
	
	private static int getNameScore(String[] names, int index){
		int letterScore = 0;
		String temp = names[index];
		temp.toLowerCase();
		for(int i  = 1; i < temp.length() - 1; i++){
			letterScore += temp.charAt(i) - 64;
		}
		return letterScore * (index + 1);
	}
	
	private static String[] readAndSort(String path){
		ArrayList<String> result = new ArrayList<String>();
		try {
			Scanner s = new Scanner(new File(path));
			s.useDelimiter(",");
			while(s.hasNext()){
				result.add(s.next());
			}
			s.close();			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String[] array = result.toArray(new String[result.size()]);
		Arrays.sort(array);
		return array;
	}

}
