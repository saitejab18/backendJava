package poly;

class A{
	public void m1() {
		System.out.println("m1 of A");
	}
}
class B extends A{
	public void m2() {
		System.out.println("m2 of B");
	}
}

public class M_ol {
    // method overriding 
	// need two classes and same method name 
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A c = new B();
		
		a.m1();
		b.m2();
		c.m1();

	}

}
