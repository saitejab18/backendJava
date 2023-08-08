package MultiThreading;

public class Eg4 extends Thread {

	public static void main(String[] args) {
          Eg4 eg1 = new Eg4();
          Eg4 eg2 = new Eg4();
          Eg4 eg3 = new Eg4();
          
          System.out.println(eg1.getPriority());
          System.out.println(eg2.getPriority());
          System.out.println(eg3.getPriority());
          
          eg1.setPriority(7);
          eg2.setPriority(8);
          eg3.setPriority(6);
          
          System.out.println(eg1.getPriority());
          System.out.println(eg2.getPriority());
          System.out.println(eg3.getPriority());
          
          eg1.setPriority(MAX_PRIORITY);
          eg2.setPriority(MIN_PRIORITY);
          eg3.setPriority(NORM_PRIORITY);
          
          System.out.println(eg1.getPriority());
          System.out.println(eg2.getPriority());
          System.out.println(eg3.getPriority());
          
          
          


          
	}

}
