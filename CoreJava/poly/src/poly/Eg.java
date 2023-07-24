package poly;
class RBI {

	public int rateOfInterest() {
		
		return 0;
		
	}
}

class ICICI extends RBI{
	
public int rateOfInterest() {
		return 2;
		
	}
}

class AXIS extends RBI{
	
public int rateOfInterest() {
		return 3;
		
	}
}

public class Eg {

	public static void main(String[] args) {
		
		RBI b1 = new ICICI();
		System.out.println(b1.rateOfInterest());
		
		RBI b2 = new AXIS();
		System.out.println(b2.rateOfInterest());
	}
}
