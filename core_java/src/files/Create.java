package files;

import java.io.File;
import java.io.IOException;

public class Create {

	public static void main(String[] args) throws IOException {
		
		
		File myobj = new File("D:\\jaravis.xlsx");
		myobj.createNewFile();
		System.out.println("filecreate :" + myobj.getName());
		System.out.println("absolute path :"+ myobj.getAbsolutePath());
		System.out.println("can read :"+ myobj.canRead());
		System.out.println("can write :"+ myobj.canWrite());
		System.out.println(" length :"+ myobj.length());
	}

}
