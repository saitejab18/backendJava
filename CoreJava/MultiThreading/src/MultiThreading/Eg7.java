package MultiThreading;

public class Eg7 extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				
			}
			
		}
	}

	public static void main(String[] args) throws InterruptedException 
	{
           Eg7 eg1 = new Eg7();
           Eg7 eg2 = new Eg7();
           Eg7 eg3 = new Eg7();
           
           eg1.start();
           eg1.join();
           
           eg2.start();
           eg2.join();
           
           eg3.start();
           eg3.join();
           
           
	}

}
