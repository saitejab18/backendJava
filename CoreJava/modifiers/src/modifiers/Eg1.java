package modifiers;

public class Eg1 {
	static private int id =101;
	static private String name= "Sai teja";
	static String email="Sai@gmail.com";
	static long contactNo = 9052350946l;
	protected String state = "Telangana";
	public String city = "Hyd";

	public static void main(String[] args) {
		System.out.println(id); // private 
		System.out.println(name);
		//Modifiers
				//Private : Same Class and Same Package
				//Protected : Diff Package and Inheritance
				//Public : Diff Class and Diff Package
				//Default : Diff Classes and Same Package
				

	}

}
