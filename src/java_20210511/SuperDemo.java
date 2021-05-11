package java_20210511;


class A {
	int a;
	A(int a) {
		this.a = a;
	}
}

class B extends A {
	B() {
		super(3);
	}
}

public class SuperDemo {
	public static void main(String[] args) {
		B a = new B();
		
		System.out.println(a.a);
		
	}
}
