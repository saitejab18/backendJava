package Exception;

import java.io.File;
import java.io.IOException;

public class Eg7 {
	public static void main(String[] args) throws IOException {
		File f = new File("sai.txt");
		f.createNewFile();
		System.out.println("File created");

		}

}
