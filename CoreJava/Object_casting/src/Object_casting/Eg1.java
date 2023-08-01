package Object_casting;
class Big
{
	public void m1() {
	System.out.println("M1 method of big");
	}

}
class Small extends Big{
	void m2() {
		System.out.println("M2 method of m2");
	}
}

public class Eg1 {

	public static void main(String[] args) {
		//Inheritance
		Small s = new Small();
		s.m1();
		s.m2();
		
		//Polymorphism
		Big b = new Small();
		b.m1();
		
		// Casting
		
		Small s1 = (Small)b;
		s1.m1(); 
		s1.m2();
		
		//Child c = (Child)new Parent();
		Small small3 = (Small)new Big();
		System.out.println(small3); //java.lang.ClassCastException
		
		
		
		
		

	}

	
}
