import java.util.ArrayList;

public class UVT_Calculator {

	public static void main(String[] args) {
		
		ArrayList<VideoViewFragment> viewFragmentArrayList = new ArrayList<VideoViewFragment>();
		viewFragmentArrayList.add(new VideoViewFragment(0, 15000));
		viewFragmentArrayList.add(new VideoViewFragment(1500, 8000));
		viewFragmentArrayList.add(new VideoViewFragment(10000, 18000));

		
		UVT_Calculator uvt_Calculator = new UVT_Calculator();
		
		int totalUVT = uvt_Calculator.CalculateTotalUVT(viewFragmentArrayList);
		
		
		System.out.println(totalUVT);
		
	}

	
	public int CalculateTotalUVT(ArrayList<VideoViewFragment> viewFragmentArray) {
		int totalViewTime = 0;		
		int timeCounter = 0;
		
		//iterate over every view fragment we have tracked
		//after each case in this loop, we continue to the next element
		//the time counter keeps track of how far down the total length of the video we've gone
		for (int i = 0; i < viewFragmentArray.size(); i++) {
			VideoViewFragment currentFragment = viewFragmentArray.get(i);
			
			//if this is the very first view fragment,
			//we count the entire length of it as view time
			if (timeCounter == 0) {
				timeCounter = currentFragment.viewEndTime;
				totalViewTime += timeCounter;
				continue;
			}
			
			//if this element is entirely contained in an element we've counted,
			//we can safely ignore it and move to the next element
			if(currentFragment.viewStartTime < timeCounter && currentFragment.viewEndTime < timeCounter) {
				continue;
			} 
			
			//if our current element starts in the middle of an already counted fragment,
			//but ends after that fragment ends, we add the difference between the counted amount
			//and the end of the current fragment
			if (currentFragment.viewStartTime < timeCounter && currentFragment.viewEndTime > timeCounter) {
				totalViewTime += currentFragment.viewEndTime - timeCounter;
				timeCounter = currentFragment.viewEndTime;
				continue;
			}
			
			//if this fragment begins after anything we've encountered so far,
			//we count its entirety
			if (currentFragment.viewStartTime > timeCounter) {
				timeCounter = currentFragment.viewEndTime;
				totalViewTime += currentFragment.totalViewTime;
				continue;
			}
			
		}
		
		return totalViewTime;
	}
}
