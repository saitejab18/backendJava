package encp;

public class Regimpl extends Register
{

	public static void main(String[] args)
	{
		//Encapsulation 
		//Binding of Data 
        Regimpl impl = new Regimpl();
        impl.setName("Saiteja");
        impl.setRollno("19311A04L1");
	    impl.setCGPA(8.0f);
	    impl.setYear(4);
	    
	    System.out.println(impl.getName());
	    System.out.println(impl.getRollno());
	    System.out.println(impl.getCGPA());
	    System.out.println(impl.getYear());
	
	}
}	

