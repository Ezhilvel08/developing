package userin;

import java.util.Scanner;

public class User_input2 {

	public static void main(String[] args) {
		
		int a, b;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		a = sc.nextInt();
		System.out.println("enter b value");
		b = sc.nextInt();

		int c = a + b;
		System.out.println("add:" + c);
	}

}
