package uvt_tracking_app;

import java.util.ArrayList;
import java.util.Scanner;

public class UVT_Calc_Launcher {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UVT_Calculator uvt_Calculator = new UVT_Calculator();
		
		//create a small array of view fragments to work with
		ArrayList<VideoViewFragment> viewFragmentArrayList = new ArrayList<VideoViewFragment>();
		
		System.out.println("How many video fragments would you like to input? (Please enter an integer):");
		int videoFragTarget = scanner.nextInt();
		
		for(int i = 0; i < videoFragTarget; i++){
			System.out.println("Please enter your view start time as an integer in milliseconds: ");
			int start = scanner.nextInt();
			
			System.out.println("Please enter your view end time as an integer in milliseconds: ");
			int end = scanner.nextInt();
			viewFragmentArrayList.add(new VideoViewFragment(start, end));
			
			System.out.println("Added a new fragment with start time: " + start + " and end time: " + end + "\n");
		}

		scanner.close();
		
		int totalUVT = uvt_Calculator.CalculateTotalUVT(viewFragmentArrayList);		
		
		System.out.println("Total UVT: " + totalUVT + " milliseconds | " + (double)totalUVT/1000 + " seconds");
	}

}
