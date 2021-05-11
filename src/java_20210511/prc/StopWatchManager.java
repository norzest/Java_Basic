package java_20210511.prc;

public class StopWatchManager {
	private StopWatchManager() {
	}

	private static class InnerInstanceClass {
		private static final StopWatchManager single = new StopWatchManager();
	}

	public static StopWatchManager getInstance() {
		return InnerInstanceClass.single;
	}
	
	public void run(StopWatch s) {
		s.getElapsedTime();
	}
}
