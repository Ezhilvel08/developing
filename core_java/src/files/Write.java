package files;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter writer = new FileWriter("D:\\vision.txt");
		writer.write("hi how are you");
		writer.close();
	}

}
