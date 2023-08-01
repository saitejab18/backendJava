package Strings;

public class Eg
{

	public static void main(String[] args)
	{
		String s1 = "Sai"; // Literals 1 SCP(String Constant Pool)
		
		String s2 = new String("Sai"); // new keyword
		
		String s3 = "Sai";
		
		String s4 = new String("Sai"); // 2 SCP
		
		//Content Comparison
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		
		//Reference Comparison
		System.out.println(s1==s3);
		System.out.println(s2==s4);

	}
}
