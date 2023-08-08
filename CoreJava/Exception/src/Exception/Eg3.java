package Exception;


public class Eg3 {

	public static void main(String[] args) {
		try {
           String s1=null;
           System.out.println("Before");
           System.out.println(s1.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("After");
	}

}
