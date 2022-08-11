 package poly;

public class Overloading {

	// method overloading

	public void add(int x, int y) {

		int z = x - y;
		System.out.println(z);

	}

	public void add(int a) {

		int c = a * a;
		System.out.println(c);

	}

	public static void main(String[] args) {
		Overloading maths = new Overloading();

		maths.add(250, 350);
		maths.add(10);

	}
}