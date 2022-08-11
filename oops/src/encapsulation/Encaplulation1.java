package encapsulation;

public class Encaplulation1 {

	// declare a variable private
	private String name;
	private int age;
	private String from;
	
	
	// to create constructor
		 Encaplulation1() {
			setName("ezhilvel");
			setAge(30);
			setFrom("mayilathrai");
		}


	// to generate getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

//	
}
