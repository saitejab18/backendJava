package Strings;

public class Eg3 {

	public static void main(String[] args) 
	{
      String s1 = "Java";
      String s2 = "Python";
      String s3 = s1.concat(s2);
      System.out.println(s3);
      
      String s4 = s1.concat("JavaScript").concat("PHP");
      System.out.println(s4);
      
      String s5 = "JavaPython";
      
      System.out.println(s5.equals(s3));//true
      
      System.out.println(s5==s3);  // false
      
      String s6 ="JavaPython";
      System.out.println(s5==s6);
	}

}
