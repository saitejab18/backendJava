package assignment;

import java.util.Scanner;

public class cel_to_faht
{
	public static void main(String[] args)
	{
		double cel;
		double faht;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature in Celcius:");
		cel = scanner.nextDouble(); // Temperature in celcius is entered
		
		faht = (1.8*cel + 32);// Formula for fahrenheit conversion
		System.out.println("Temperature in fahrenheit:" + faht);
		scanner.close();
				
	}

}
