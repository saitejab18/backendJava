package Multi_Level;
class Grandparent{
	void m1() {
		System.out.println("m1 method");
	}
}
class Parent extends Grandparent{
	void m2() {
		System.out.println("m2 method");
	}
}
 class Child extends Grandparent{
	 void m3()
	 {
		 System.out.println("m3 method");
	 }
 }

public class Hierarchial {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m2();
		p.m1();
		
		Child c = new Child();
		c.m3();
		c.m1();
	}

}
