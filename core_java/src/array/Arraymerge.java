package array;

public class Arraymerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = { "apple", "orange", "banana" };
		String[] b = { "water melon", "pine apple" };

		String[] c = new String[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("------------------");

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("------------------");
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		
		
		System.out.println("-----------------");
		
		// for loop and if else condition

		for (int i = 0; i < c.length; i++) {

			if (i < a.length) {
				System.out.println(a[i]);
			} else
				System.out.println(b[i - a.length]);
		}
	}
}
