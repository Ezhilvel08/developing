package methods;

public class math {

	 void add () {
		int a=250;
		int b=350;
		int c= a+b;
		System.out.println("add two value :" + c );
	}
	 void sub () {
		int a=250;
		int b=350;
		int c= a-b;
		System.out.println("sub two value :" + c );
	}
	 void multiply () {
		int a=250;
		int b=350;
		int c= a*b;
		System.out.println("multiply two value :" + c );
	}
	 void divide () {
		int a=250;
		int b=250;
		int c=a/b;
		System.out.println("divide two value :" + c );
	}
	
	public static void main(String[] args) {
		math calc = new math();
		calc.add();
		calc.sub();
		calc.multiply();
		calc.divide();
	}

}
