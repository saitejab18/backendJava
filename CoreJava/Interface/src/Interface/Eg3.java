package Interface;
// If a class exhibits multiple interfaces then they are separated by commas

interface AAA{
	void m1();
		}
interface BBB{
	void m2();
}
public class Eg3 implements AAA,BBB{

	public static void main(String[] args) {
		 Eg3 eg = new Eg3();
		 eg.m1();
		 eg.m2();
		 

	}

	@Override
	public void m2() {
		System.out.println("M2 method");
		
	}

	@Override
	public void m1() {
		System.out.println("M1 method");
		
	}

}
