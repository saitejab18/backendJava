package variable;

public class Static {
	int a = 10;// Instance Variables
	int b = 20;
	static int x = 5;// Static Variables
	static int y = 6;
	public static void main(String[] args)
	{
		int i = 15; // Local Variables
		int j = 20;
		System.out.println(i);
		System.out.println(j);
		Static st = new Static();
		System.out.println(st.a);
		System.out.println(st.b);
		System.out.println(x);
		System.out.println(y);
			}
		}
	


