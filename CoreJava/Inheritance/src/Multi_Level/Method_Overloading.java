package Multi_Level;

public class Method_Overloading {

	public static void main(String[] args) {
		Method_Overloading m =new Method_Overloading();
		m.m1(10);
		m.m1(200l);
		m.m1(300d);

	}
	public void m1(int a)
	{
		System.out.println("Int:" + a);
	}
	public void m1(long b) {
		System.out.println("Long:" + b);
	}
	public void m1 (double d) {
		System.out.println("Double:" + d);
	}
}
