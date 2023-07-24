package abs;
abstract class A{
	void m1() {
		System.out.println("M1 method implementation");
	}
	public abstract void m2();
}
class B extends A{
	@Override
	public void m2() {
		System.out.println("M2 method implementation");
	}
}
public class Eg1 {

	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
		
		A a = new B();
		a.m1();
		a.m2();

	}

}
