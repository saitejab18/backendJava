package Multi_Level;

class AA{
	public AA() {
		System.out.println("Default");
	}
}
class BB extends AA{
	  // no constructor overriding 
	public BB() {
		System.out.println("Default of B");
	}

	public void AA() {
		// TODO Auto-generated method stub
		
	}
}


public class Eg5 {

	public static void main(String[] args) {
		BB b = new BB();
		b.AA();
		

	}

}
