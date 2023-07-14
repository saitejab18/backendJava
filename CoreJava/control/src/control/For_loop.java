package control;

import java.util.Scanner;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
		for(int j=5;j>0;j--)
		{
			System.out.println(j);
		}
		
		 Scanner scanner = new Scanner(System.in); 
		 System.out.println("Enter any number: ");
		 int a = scanner.nextInt();
			int k;
			for(k=0;k<a;k++)
			{
				System.out.println(k);
			}
				
			scanner.close();
		}
	}

