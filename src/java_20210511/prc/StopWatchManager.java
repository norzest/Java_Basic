package java_20210511.prc;

public class StopWatchManager {
	private static StopWatchManager single;

	private StopWatchManager() {}

	public static StopWatchManager getInstance() {
		if (single == null) {
			single = new StopWatchManager();
		}
		return single;
	}
	
	public void run(StopWatch s) {
		s.getElapsedTime();
	}
}
