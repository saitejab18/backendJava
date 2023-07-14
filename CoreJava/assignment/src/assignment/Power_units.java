package assignment;
import java.util.Scanner;

public class Power_units {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter power consumed by T.V in watts :");
	double t_p = scanner.nextInt();
	System.out.println("Enter the working time of tv in hours:");
	double t_t = scanner.nextDouble();
	
	System.out.println("Enter power consumed by refridgerator in watts:");
	double r_p = scanner.nextDouble();
	System.out.println("Enter the working time of refridgerator in hours:");
	double r_t =scanner.nextDouble();

	System.out.println("Enter the power consumed by A.C in watts:");
	double a_p = scanner.nextDouble();
	System.out.println("Enter the working time of A.C in hours: ");
	double a_t = scanner.nextDouble();
	
	System.out.println("Enter the power consumed by lights in watts:");
	double l_p = scanner.nextDouble();
	System.out.println("Enter the working time of lights in hours:");
	double l_t = scanner.nextDouble();
	
	double units = (t_p*t_t + r_p*r_t + a_p*a_t + l_p*l_t)/1000;
	System.out.println("Units consumed in a month:" + units*30);
	System.out.println("Units consumed in a year:" + units *365);
	
	scanner.close();
}

}
