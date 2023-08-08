package Exception;

public class Eg2 {

	public static void main(String[] args) {
		try {
         int a[]= {1,2,3,4,5};
         System.out.println(a[0]);
         System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
				
			}
		System.out.println("after");
		}
	}


