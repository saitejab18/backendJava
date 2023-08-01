package Interface;
// In some cases we dont want to implement all the abstract methods in the interface, then we can 
//implement in next abstarct class and main method

interface Ab{
	void m1();
	void m2();
	void m3();
	void m4();
}
abstract class ABc implements Ab{
	@Override
	public void m1() {
		System.out.println("M1 method");
	}
	public void m2() {
		System.out.println("M2 method");
	}
}
public class Eg4 extends ABc{

	public static void main(String[] args) {
		Eg4 eg = new Eg4();
		eg.m3();
		eg.m4();

	}

	@Override
	public void m3() {
		System.out.println("M3");
		
	}

	@Override
	public void m4() {
		System.out.println("M4");
		
	}

}
