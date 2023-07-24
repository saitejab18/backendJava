package Wrapper_casting;
public class Eg1 {

	public static void main(String[] args) {
     double d1 = 100.35;
     System.out.println(d1);
      float f1 = (float)d1;
      System.out.println(f1);
      
      double d2 = 75.47;
      Float f2 = (float) d2;
      System.out.println(f2);
      
      double d3 = 23.56958;
      Long l1 = (long) d3;
      System.out.println(l1);
      
      Double d4 = 45.897;
      Integer i1 = (Integer)d4.intValue();
      System.out.println(i1);
	}

}
