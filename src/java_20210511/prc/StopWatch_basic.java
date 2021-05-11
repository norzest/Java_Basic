package java_20210511.prc;
// 밀리초로 경과시간 만들기
// 나노초로 경과시간 만들기

public class StopWatch_basic {
	public static void main(String[] args) {
		StopWatchManager s = StopWatchManager.getInstance();

		long l = 380000000; // for루프 할 횟수 설정
		s.run(new MilliS(l));
		s.run(new MicroS(l));
		s.run(new NanoS(l));
	}
}