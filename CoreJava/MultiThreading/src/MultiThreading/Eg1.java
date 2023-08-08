package MultiThreading;
public class Eg1 {

	public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        System.out.println(thread.getName());
        System.out.println(thread.getClass());
        System.out.println(thread.getState());
	}

}
