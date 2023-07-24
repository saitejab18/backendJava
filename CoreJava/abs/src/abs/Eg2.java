package abs;
abstract class C{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	abstract void m4();
}
abstract class D extends C{
	@Override
	void m1() {
		System.out.println("M1 method");
	}
	@Override
	void m2() {
		System.out.println("M2 method");
	}
}

class E extends D{
	@Override
	void m3() {
		System.out.println("M3");
	}
	@Override
	void m4() {
		System.out.println("M4");
	}
}

public class Eg2 {

	public static void main(String[] args) {
		E e = new E();
		e.m1();
		e.m2();
		e.m3();
		e.m4();
		

	}

}
