package variable;

public class Method2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Method2 std1 = new Method2();
		std1.student_details("Rahul","19311A04J2","ECE",8.5f);
		college_details("SNIST","HYD");
		
		Method2 std2 = new Method2();
		std2.student_details("Pranay","19311A04K1", "CSE",8.7f);
		college_details("SNIST","HYD");
		
		Method2 std3 = new Method2();
		std3.student_details("Akshay","19311A04N6","IT",8.0f);
		college_details("SNIST","HYD");
		
		}

void student_details(String Name,String RollNo,String branch,float CGPA)
{
	System.out.println("Name:" + Name);
	System.out.println("Roll no:" + RollNo);
	System.out.println("Branch:" + branch);
	System.out.println("CGPA:" + CGPA);
	
}
static void college_details(String CollegeName,String Address)
{
	System.out.println(CollegeName);
	System.out.println(Address);
	System.out.println(""); 
	
}
}

