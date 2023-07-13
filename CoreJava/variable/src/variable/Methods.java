package variable;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods meth = new Methods();
		meth.instmeth();
		staticmeth();
	}
	

public void instmeth()
{
	System.out.println("Instance Method");
}
public static void staticmeth() 
{
	System.out.println("Static method");
}
}

