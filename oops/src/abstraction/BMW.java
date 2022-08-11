package abstraction;

public class BMW extends Car { // using inheritance keyword extend

	public void enginecc() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("engine size:"+c);
	}
	
	public void vault() {
		System.out.println("bmw car secrect vault");
	}

	public static void main(String[] args) {
		
		BMW obj = new BMW(); // in abstract method to create obj to call parent class name 
		obj.enginecc();
		obj.vault();
		obj.name();

	}

}
