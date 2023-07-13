package control;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bufferclass {
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String readLine = reader.readLine();
		int a = Integer.parseInt(readLine);
		System.out.println(a);
		if(a < 20) {
			System.out.println("If Block Executed 03");
		}else {
			System.out.println("Else Block Executed 03");
		}
		reader.close();
	}
	

}
