package Exception;

public class Eg4 {

	public static void main(String[] args) {
       try {
    	   String s1 ="Hello Sai";
       System.out.println("Before");
       System.out.println(s1.charAt(3));
       System.out.println(s1.charAt(10));
		
	} catch (StringIndexOutOfBoundsException e) {
System.out.println(e);	}
        
	}

}
