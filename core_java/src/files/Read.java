package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File myfile = new File("D:\\vision.txt");
		Scanner scan = new Scanner(myfile);
		String mytext = scan.nextLine();
		System.out.println(mytext);

	}

}
