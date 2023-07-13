package variable;

public class Constructor {
	Constructor()
	{
		System.out.println("Default constructor");
	}
   Constructor(int a, int b)
   {
	   System.out.println(a);
	   System.out.println(b);
   }
   public static void main(String[] args)
   {
	   new Constructor();
	   new Constructor(10,20);
   }
}

