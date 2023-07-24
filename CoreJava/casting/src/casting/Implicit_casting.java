package casting;

public class Implicit_casting 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// byte-short-int-long-float-double
		//------------char-----------------
		byte b1 = 10;
		System.out.println(b1);
		
		short s1 = b1;
		System.out.println(s1);
		
		int i1 = s1;
		System.out.println(i1);
		
		long l1 = i1;
		System.out.println(l1);
		
		float f1 = l1;
		System.out.println(f1);
		
		double d1 = f1;
		System.out.println(d1);
		
		char ch = 's';
		System.out.println(ch);
		
		int i2 = ch;
		System.out.println(i2);
	}
}
