package Interface;
interface ParentOne{
	void m1();
	public void m2();
	abstract void m3();
	abstract void m4();
}
public class Eg1 implements ParentOne {

	public static void main(String[] args) {
		Eg1 eg = new Eg1();
          eg.m1();
          eg.m2();
          eg.m3();
          eg.m4();
	}
	@Override
	public void m1() {
		System.out.println("M1 method");
	}
    @Override
    public void m2() {
    	System.out.println("m2 method");
    }
    @Override
    public void m3() {
    	System.out.println("M3 method");
    }
    @Override
    public void m4()
    {
    	System.out.println("M4 method");
    }
}
