package MultiThreading;

public class Eg2 extends Thread{

	public static void main(String[] args) {
       Eg2 eg2= new Eg2();
       eg2.start();
		
	}
	public void run() {
		System.out.println("Run method");
	}

}
