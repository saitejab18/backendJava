package control;

import java.util.Scanner;

public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double userSalary = scanner.nextInt();
		scanner.close();
		if (userSalary==10000)
		{
			System.out.println("Usersalary:" + userSalary);
		}
		else if(userSalary==20000)
		{
			System.out.println("Usersalary:" + userSalary);
		}
		else if(userSalary==30000)
		{
			System.out.println("Usersalary:" + userSalary);;
		}
		else {
			System.out.println("User salary not valid");
		}

	}

}
