package java_20210511.prc;

public class StopWatchManager {
	private StopWatchManager() {
	}

	private static class Holder {
		private static final StopWatchManager single = new StopWatchManager();
	}

	public static StopWatchManager getInstance() {
		return Holder.single;
	}
	
	public void run(StopWatch s) {
		s.getElapsedTime();
	}
}
