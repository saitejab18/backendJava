package Strings;

public class Eg4 {

	public static void main(String[] args) {
            String s1 = new String("Java");
            
            //mutable 
            //Sysnchronised
            StringBuffer sb1 = new StringBuffer("JavScript");
            System.out.println(sb1.append("Node"));
            
            
            // not synchronised
            StringBuilder sb2 = new StringBuilder("HTML");
            System.out.println(sb2.append("CSS"));
            
	}

}
