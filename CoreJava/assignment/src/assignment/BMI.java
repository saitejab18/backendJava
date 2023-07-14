package assignment;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
       
		System.out.println("Enter weight in kilograms:");
        float weight = scanner.nextFloat();  // Weight is entered in Kg's
        
        System.out.println("Enter height in meters:");
        float height = scanner.nextFloat();// Height is entered in Meter's
        
        float BMI = weight/(height*height);// BMI is Calculated 
        System.out.println("Body Mass Index:" + BMI);
        
        scanner.close();
        
	}

}
