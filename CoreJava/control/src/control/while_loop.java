package control;

import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i =0;
	while(i<5)
	{
		System.out.println(i);
		i++;
	} 
    
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    while(x<20) {
    	System.out.println(x);
    	x++;
    }
    scanner.close();
	}

}
