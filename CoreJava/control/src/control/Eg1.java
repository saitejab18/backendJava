package control;

import java.util.Scanner;

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		if(a<10)
		{
			System.out.println("If block executed");
		}
		else {
			System.out.println("Else block executed");
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int b = scanner.nextInt();
		scanner.close();
		if (b<20) {
			System.out.println("If block executed 02 ");
		}
		else {
			System.out.println("Else block executed 02");
		}
		
        
	}

}
