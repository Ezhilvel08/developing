package interfac;

public class Cchild implements cars {

	public void engine() {
		System.out.println("bmw car engine");
	}

	public void vault() {
		System.out.println("bmw car secrect vault");
	}

	public static void main(String[] args) {

		Cchild obj = new Cchild(); 
		obj.engine();
		obj.vault();

	}

}
