package Strings;

public class Eg2 {

	public static void main(String[] args) {
       String s1 = "sai";
       String s2 = "Sai";
       
       System.out.println(s1.equals(s2));
       System.out.println(s1==s2);
       
       System.out.println(s1.equalsIgnoreCase(s2));  // ignores capital or small
	}                        // just checks the content

}
