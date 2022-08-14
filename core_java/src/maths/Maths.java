package maths;

import java.util.Scanner;

public class Maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y;
		// int y ;
		Scanner solve = new Scanner(System.in);
		System.out.println("enter value");

		x = solve.nextInt();
		y = solve.nextInt();

		int z = x + y;
		System.out.println("add:"+z);

		int a = x - y;
		System.out.println("sub:"+a);

		int b = x * y;
		System.out.println("multiply:"+b);

		int c = y / x;
		System.out.println("divide :"+c);

		// ctrl+/ short cut
		// System.err.println(z);

		/*
		 * ctrl+shift+/ shortcut System.out.println(Math.sqrt(x));
		 * System.out.println(Math.random()*101);
		 */
	}

}
