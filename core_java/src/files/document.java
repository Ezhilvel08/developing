package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class document {

	public static void main(String[] args) throws IOException  {
		File myfile = new File("D://filename.txt//"); 
//		boolean my = myfile.createNewFile();
//		System.out.println(my);
		
		FileWriter writer = new FileWriter(myfile);
		writer.write("file is creating");
		writer.close();

	}

}
