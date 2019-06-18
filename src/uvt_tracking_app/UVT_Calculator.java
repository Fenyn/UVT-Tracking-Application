package uvt_tracking_app;

import java.util.ArrayList;

public class UVT_Calculator {

	// Calculates the UVT for a video, given an array of view fragments.
	// It is important to note that while the provided array does not need to be
	// sorted,
	// the algorithm only works correctly on a sorted array.
	public int CalculateTotalUVT(ArrayList<VideoViewFragment> viewFragmentArray, int chapterStart, int chapterEnd) {
		int totalViewTime = 0;
		int timeCounter = 0;

		viewFragmentArray.sort(null);

		/*
		 * iterate over every view fragment we have tracked after each case in this
		 * loop, we continue to the next element NOTE: I chose to use continue instead
		 * of a long if/else statement because I think it makes the code more readable
		 */
		for (int i = 0; i < viewFragmentArray.size(); i++) {
			VideoViewFragment currentFragment = viewFragmentArray.get(i);
			
			int fragmentStart = currentFragment.viewStartTime;
			int fragmentEnd = currentFragment.viewEndTime;
			
			if(fragmentEnd > chapterEnd) {
				fragmentEnd = chapterEnd;
			}

			if (timeCounter < chapterStart) {
				timeCounter = chapterStart;
			}

			// if this is the very first view fragment,
			// we count the entire length of it as view time
			if (timeCounter == 0) {
				timeCounter = fragmentEnd;
				totalViewTime += currentFragment.totalViewTime;
				continue;
			}

			// in the case of view fragment being entirely before our chapter start
			if (fragmentEnd < chapterStart) {
				continue;
			}

			// in the case of view fragment entirely after chapter start
			if (fragmentStart > chapterEnd) {
				continue;
			}

			// if overlapping the beginning of the chapter
			if (fragmentStart < chapterStart && fragmentEnd > chapterStart) {
				totalViewTime += fragmentEnd - chapterStart;
				timeCounter = fragmentEnd;
				continue;
			}

			/*// if overlapping end of chapter
			if (currentFragment.viewStartTime < chapterEnd && currentFragment.viewEndTime > chapterEnd) {
				totalViewTime += chapterEnd - currentFragment.viewStartTime;
				timeCounter = chapterEnd;
				continue;
			}*/

			// if this element is entirely contained in an element we've counted,
			// we can safely ignore it and move to the next element
			if (fragmentStart < timeCounter && fragmentEnd < timeCounter) {
				continue;
			}

			// if our current element starts in the middle of an already counted fragment,
			// but ends after that fragment ends, we add the difference between the counted
			// amount
			// and the end of the current fragment
			if (fragmentStart <= timeCounter && fragmentEnd > timeCounter) {
				totalViewTime += fragmentEnd - timeCounter;
				timeCounter = fragmentEnd;
				continue;
			}

			// if this fragment begins after anything we've encountered so far,
			// we count its entirety
			if (fragmentStart > timeCounter) {
				if (fragmentEnd == chapterEnd) {
					timeCounter = chapterEnd;
					totalViewTime += chapterEnd - fragmentStart;
					continue;
				} else {
					timeCounter = fragmentEnd;
					totalViewTime += currentFragment.totalViewTime;
					continue;
				}
			}

		}

		return totalViewTime;
	}
}
