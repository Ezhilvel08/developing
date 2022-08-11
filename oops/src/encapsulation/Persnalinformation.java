package encapsulation;

public class Persnalinformation {
 
	  private String name;
	  private int age;
	  private int accountnumber;
	  private int accountbalance;
	     
	 public Persnalinformation(){
	    	 setName("ramesh");
	    	 setAge(30);
	    	 setAccountnumber(12345);
	    	 setAccountbalance(100000);
	    	 
	     }
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
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(int accountbalance) {
		this.accountbalance = accountbalance;
	}
	  

}
