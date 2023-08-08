package MultiThreading;

public class Eg3 implements Runnable {

	public static void main(String[] args) {
         Eg3 eg3 = new Eg3();
         Thread t1 = new Thread(eg3);
         t1.start();
         
         Thread t2 = new Thread(eg3);
         t2.start();
         
         Thread t3 = new Thread(eg3);
         t3.start();

	}

	@Override
	public void run() {
	System.out.println("Run Method");	
	}

}
