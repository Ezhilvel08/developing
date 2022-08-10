package userin;

import java.util.Scanner;

public class User_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1;
		String num2;
		// create scanner obj
		Scanner number = new Scanner(System.in);
		System.out.println("enter name");// for verification give sysout
		num1=number.nextLine();
		num2=number.nextLine();
		
		if(num1.equals(num2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
