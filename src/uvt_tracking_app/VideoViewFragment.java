package uvt_tracking_app;

public class VideoViewFragment implements Comparable<VideoViewFragment>{
	
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

	//allows us to sort the videos by view start time
	@Override
	public int compareTo(VideoViewFragment o) {
		return this.viewStartTime - o.viewStartTime;
	}

}
