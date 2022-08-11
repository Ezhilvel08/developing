package inheritance;

public class Calc3 extends calc2 {

	 void multiple() {
		int a= 10;
		int b= 20;
		int c= a*b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {

		
		 Calc3 maths = new Calc3();
		 maths.sub();
		 maths.add();
		 maths.multiple();
		
	}

}
