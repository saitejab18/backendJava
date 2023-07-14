package control;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bufferclass {
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number:");
		String readLine = reader.readLine();
		int a = Integer.parseInt(readLine);
		if(a < 20) {
			System.out.println("If block");
		}else if(a<30){
			System.out.println("Else if 01");
		}
		else if(a<40)
		{
			System.out.println("else if 02");
		}
		else
		{
			System.out.println("Else block");
		}
		reader.close();
	}
	

}
