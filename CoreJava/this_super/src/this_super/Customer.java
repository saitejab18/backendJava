package this_super;

public class Customer
{
	public void addCustomer() 
	{
		System.out.println("Add");
		this.deleteCustomer();
		this.updateCustomer();
	}
	public void deleteCustomer() 
	{
		System.out.println("Delete");
	}
	public void updateCustomer() 
	{
		System.out.println("update");
	}

	public static void main(String[] args)
	{
		
           Customer c = new Customer();
           c.addCustomer();
	}

}
