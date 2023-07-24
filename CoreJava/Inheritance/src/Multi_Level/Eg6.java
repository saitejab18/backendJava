package Multi_Level;
class  S{
	 int rateofinterest() {
		return 0;
	}
}
class T extends S{
	int rateofinterest() {
		return 2;
	}
}
class U extends T{
	int rateofinterest() {
		return 3;
	}
}

public class Eg6 {

	public static void main(String[] args) {
		S a = new T();
		S b = new U();
		System.out.println(a.rateofinterest());
		System.out.println(b.rateofinterest());
			

	}

}
