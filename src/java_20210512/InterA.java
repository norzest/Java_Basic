package java_20210512;
// 인터페이스간 상속은 extends 키워드 사용, 다중 상속 가능
public interface InterA extends InterB, InterC {
	double PI = 3.14; // public static final 생략돼있음
	// abstract 생략 가능
	void mA(); // 접근 한정자는 붙이지 않으면 public

	// public static final double PI = 3.14;
	// public abstract void mA();
}
