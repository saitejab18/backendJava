package has;

class SeatsAvailable{
	public synchronized void bookMovieTickets(String uname,int totalSeats) throws InterruptedException{
		if(seats>=totalSeats && totalSeats>0) 
		{
			
		}
	}

	
	
}

class Tickets extends Thread{
	SeatsAvailable seatsAvailable;
	String userName;
	int noOfSeats;
	public Tickets(SeatsAvailable seatsAvailable, String userName, int noOfSeats) {
		super();
		this.seatsAvailable = seatsAvailable;
		this.userName = userName;
		this.noOfSeats = noOfSeats;
	}
	@Override
	public void run() {
		try {
			seatsAvailable.bookMovieTickets(userName, noOfSeats);
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class Eg {

	public static void main(String[] args) {

		SeatsAvailable available = new SeatsAvailable();
		Ticket t1 = new Tickets(available,"Saiteja",2);
		Ticket t2 = new Tickets(available,"Sai kumar",2);
		t1.start();
		t2.start();
		
	}

}
