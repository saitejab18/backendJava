package Exception;

public class Eg5 {

	

	public static void main(String[] args) {
		try {
			 System.out.println("Before");
             String s1 = "ten";
             int parseInt = Integer.parseInt(s1);
             System.out.println(parseInt);
		} catch(NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("After");
		}
             
	}

