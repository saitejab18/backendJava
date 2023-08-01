package this_super;

public class UserProfile {
	public String Username;
	public String email;
	public long contact;
	public String address;
	
	public UserProfile(String Username,String email,long contact,String address) {
		this.Username=Username;
		this.email=email;
		this.contact=contact;
		this.address=address;
		
	}
	public void display() {
		System.out.println(Username);
		System.out.println(email);
		System.out.println(contact);
		System.out.println(address);
	}

	public static void main(String[] args) {
           UserProfile up = new UserProfile("Saiteja","Sai@gmail.com",9052350946l,"Hyd");
           up.display();
	}

}
