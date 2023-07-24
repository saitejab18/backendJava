package Multi_Level;

public class C_overloading {

	public static void main(String[] args) {
		new C_overloading();
		new C_overloading(20);
		new C_overloading(100d);
		
	}
	C_overloading(){
		System.out.println("Default");
		}
	C_overloading(int a){
		System.out.println("Integer:" + a);
	}
	C_overloading(double d){
		System.out.println("Double:" + d);
	}

}
