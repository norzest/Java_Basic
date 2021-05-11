package java_20210511.prc;

public abstract class StopWatch {
	long startTime;
	long endTime;
	
	// 생성자 (디폴트 값은 그냥 넣어둔 것)
	public StopWatch() {
		this.endTime = 3000000l;
	}
	
	public StopWatch(long endTime) {
		this.endTime = endTime;
	}
	
	// endTime을 받아 그 횟수만큼 반복
	private void waitTime() {
		for(long i = 0; i < this.endTime; ++i) {}
	}

	public abstract void getStartTime(); // startTime 설정
	public abstract void getEndTime(); // endTime 설정
	public abstract void getTime(); // 경과 시간 계산

	final public void getElapsedTime() {
		getStartTime(); // 자손 클래스에서 override
		waitTime();
		getEndTime(); // 자손 클래스에서 override
		getTime(); // 자손 클래스에서 override
	}
	
}
