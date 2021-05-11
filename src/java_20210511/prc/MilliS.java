package java_20210511.prc;

public class MilliS extends StopWatch {
	
	// 생성자
	public MilliS() {
		
	}
	
	public MilliS(long endTime) {
		super(endTime);
	}
	
	
	@Override
	public void getStartTime() { // 밀리초로 startTime 설정
		startTime = System.currentTimeMillis();
	}

	@Override
	public void getEndTime() { // 밀리초로 endTime 설정
		endTime = System.currentTimeMillis();
	}
	
	@Override
	public void getTime() { // elapsedTime에 경과 시간을 받아 출력
		double elapsedTime = (double)(endTime - startTime)/1000;
		System.out.printf("%.4f 밀리초 \n", elapsedTime);
	}
}
