package Interface;
interface AA{
	int a= 10;
	public static final int b =20;
	int c= 30;
}
public class Eg2 implements AA{

	public static void main(String[] args) {
		
  System.out.println(Eg2.a);
  System.out.println(Eg2.b);
  System.out.println(Eg2.c);
	}

}
