package java_20210511.prc;

public class MicroS extends StopWatch {

	public MicroS() {
	
	}
	
	public MicroS(long endTime) {
		super(endTime);
	}
	
	@Override
	public void getStartTime() { // 마이크로초로 startTime 설정
		startTime = System.nanoTime();
	}
	
	@Override
	public void getEndTime() { // 마이크로초로 endTime 설정
		endTime = System.nanoTime();
	}
	
	@Override
	public void getTime() { // elapsedTime에 경과 시간을 받아 출력
		double elapsedTime = (double)(endTime - startTime)/1000000;
		System.out.printf("%.4f 마이크로초 \n", elapsedTime);
	}
	
}
