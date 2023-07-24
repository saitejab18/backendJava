package Multi_Level;

class A{
	void m1() {
		System.out.println("M1 method");
	}
}
class B extends A{
	void m2() {
		System.out.println("M2 method");
	}
}
public class Multi_Level 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       B b = new B();
       b.m1();
       b.m2();
       
	}
}


