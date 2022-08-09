package conditional_statement;

import java.util.Scanner;

public class Conditional_3 {
	public static void condition3() {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		int a = scan.nextInt();
		if (a % 2 == 0) {
			System.out.println("a is even number");
		} else {
			System.out.println("a is odd number");
		}

	}

	public static void main(String[] args) {
		condition3();

	}

}
