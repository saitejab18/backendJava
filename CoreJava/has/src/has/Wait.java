package has;

class A implements Runnable{

	@Override
	public void run() {
		System.out.println(": 03 Run method of class A");
		synchronized(this) {
			System.out.println(": 05 synchronized block of class A");
			for (int i = 0; i < 5; i++) {
				System.out.println(i + "06 : loop insode A");
			}
		
		}
		
	}
	
}

public class Wait {

	public static void main(String[] args) {
       A a = new A();
       System.out.println(": 01 object reference of A" + a);
       
       Thread t = new Thread(a);
       
	}

}
