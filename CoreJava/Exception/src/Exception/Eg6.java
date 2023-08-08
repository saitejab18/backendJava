package Exception;
class JDBC{
	static {
		System.out.println("Static Block");
	}
}
public class Eg6 {
	public static void main(String[] args) {
           try {
			Class.forName("Exception.JDBsC");
		} catch (ClassNotFoundException e) {
          System.out.println(e);
		}
	}

}
