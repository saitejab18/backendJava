package Interface;
enum Days{
	SUNDAY,MONDAY,TUESDAY,WENESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class Eg5 
{

	public static void main(String[] args)
	{
      System.out.println(Days.MONDAY);
      System.out.println(Days.SATURDAY);
      
      System.out.println();
      
      Days[] values = Days.values();
      for(Days days : values) 
      {
    	  System.out.println(days);
    	  System.out.println(days.ordinal());
      }
      System.out.println();
	
	Days valueOf = Days.valueOf("MONDAY");
	System.out.println(valueOf);

}
}
