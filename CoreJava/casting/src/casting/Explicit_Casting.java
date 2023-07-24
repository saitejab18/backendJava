package casting;

public class Explicit_Casting 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        // double-float-long-int-short-byte
		//-------------------char----------
		double d1 =10;
		System.out.println(d1);
		
		float f1 = (float)d1;
		System.out.println(f1);
		
		long l1 = (long)f1;
		System.out.println(f1);
		
		int i1= (int)l1;
		System.out.println(i1);
		
		short s1 = (short)i1;
		System.out.println(s1);
		
		byte b1 = (byte)s1;
		System.out.println(b1);
		
		char ch = 's';
		int i2 = (int)ch;
		System.out.println(i2);
		}
}
