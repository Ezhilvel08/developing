package methods;

public class Method1 {
	
	public static int mymethod(int x,int y) {
		return x+y;
	}

	public static void myresult() {
		int z = mymethod(23, 34);
		System.out.println(z);
		
	}
	public static void main(String[] args) {


		myresult();

	}

}
