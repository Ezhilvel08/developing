 package poly;

public class Calc extends calc2 {
// over ridding
	@Override //
	public void add(int x, int y) {

		int z = x - y;
		System.out.println(z);

	}

	public static void main(String[] args) {
		// over ridding method obj crearting
		Calc maths2 = new Calc();
		maths2.add(10, 20);
		maths2.multi(10, 20);

	}

}
