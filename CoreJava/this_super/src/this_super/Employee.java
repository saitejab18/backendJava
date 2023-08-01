package this_super;

public class Employee {
	Employee(){
		this("saiteja",9237568925l);
		System.out.println("Default Constructor");
		
	}
	Employee(String Name,long contact){
		System.out.println(Name);
		System.out.println(contact);
	}

	public static void main(String[] args) {
		new Employee();
 

	}

}
