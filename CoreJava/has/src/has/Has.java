package has;

class Company{
	String CompanyName;
	String companyAddress;
	
}


public class Has {
	int empId;
	String empUserName;
	String empEmail;
	public Has(int empId, String empUserName, String empEmail, Company company) {
		super();
		this.empId = empId;
		this.empUserName = empUserName;
		this.empEmail = empEmail;
		this.company = company;
	}


	Company company;
	

	public static void main(String[] args) {

	}

}
