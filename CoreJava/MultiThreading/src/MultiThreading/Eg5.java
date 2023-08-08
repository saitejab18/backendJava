package MultiThreading;

public class Eg5 {

	public static void main(String[] args) {

		Thread t1 = new Thread();
	     t1.start();
	     System.out.println(t1.isAlive());
	     
	     Thread t2 = new Thread();
	     t2.start();
	     System.out.println(t2.isAlive());
	     
	     System.out.println(Thread.activeCount());
     
     
    
	}

}
