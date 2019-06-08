
public class VideoViewFragment {
	
	int viewStartTime;
	int viewEndTime;
	float totalViewTime;
	
	VideoViewFragment(int startTime, int endTime){
		if(endTime < startTime) {
			throw new Error("End Time must come AFTER Start Time");
		}
		viewStartTime = startTime;
		viewEndTime = endTime;
		totalViewTime = endTime - startTime;
	}

}
