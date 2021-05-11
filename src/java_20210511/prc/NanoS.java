package java_20210511.prc;

public class NanoS extends StopWatch {

	public NanoS() {
		
	}
	
	public NanoS(long endTime) {
		super(endTime);
	}
	
	@Override
	public void getStartTime() { // 나노초로 startTime 설정
		startTime = System.nanoTime();
	}
	
	@Override
	public void getEndTime() { // 나노초로 endTime 설정
		endTime = System.nanoTime();
	}
	
	@Override
	public void getTime() { // elapsedTime에 경과 시간을 받아 출력
		double elapsedTime = (double)(endTime - startTime)/1000;
		System.out.printf("%.4f 나노초 \n", elapsedTime);
	}
}
