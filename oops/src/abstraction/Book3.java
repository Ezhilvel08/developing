package abstraction;

public class Book3 extends Book2 {

	public void physics() {

		System.out.println("physics book");

	}

	public void chemistry() {
		System.out.println("chemistry book");
	}

	public void english() {
		System.out.println("english book");
	}

	public void tamil() {
		System.out.println("tamil book");
	}

	public static void main(String[] args) {

		Book3 obj = new Book3();
		obj.physics();
		obj.english();
		obj.chemistry();
		obj.tamil();
		obj.maths();

	}

}
