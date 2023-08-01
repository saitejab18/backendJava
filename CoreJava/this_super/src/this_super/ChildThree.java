package this_super;

 class ParentThree 
{
 public ParentThree() {
	 System.out.println("Default parent");
	 
 }
 public ParentThree(int a) {
	 System.out.println("p3:" + a);
 }
}
public class ChildThree extends ParentThree{
	public ChildThree() {
		this(10,20);
		System.out.println("Default constructor of c3");
	}
	
	public ChildThree(int a, int b) 
	{ 
		super(80);
		System.out.println("c3:"+a+" "+b);
	}
	public static void main(String[] args) {
		new ChildThree();
	}
}
