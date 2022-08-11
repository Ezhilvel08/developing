package encapsulation;

import java.util.Scanner;

public class Encap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encap Encap21 = new Encap();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter detail");
		
		String fname = scan.nextLine();
		String lname = scan.nextLine();
		int age = scan.nextInt();
		
		Encap21.setFirstname(fname);
		Encap21.setLastname(lname);
		Encap21.setAge(age);
		System.out.println("first name :" + Encap21.getFirstname());
		System.out.println("last name :" + Encap21.getLastname());
		System.out.println("Age :" + Encap21.getAge());
	}

}
