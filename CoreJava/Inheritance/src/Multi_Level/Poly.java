package Multi_Level;
class A{
	void m1() {
		System.out.println("M1 method of A");
			}
}
class B extends A{
	void m2() {
		System.out.println("M2 method of B");
	}
}


public class Poly {

	public static void main(String[] args) {
		// Method Overriding need two classes 
		// Method name should be same
       A a = new A();
       a.m1();
       
       //inheritance 
       B b = new B();
       b.m1();
       
       //poly
       A aa = new B();
       aa.m1();
	}

}
