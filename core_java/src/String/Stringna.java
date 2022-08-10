package String;

public class Stringna {

	public static void main(java.lang.String[] args) {
		
		  String a="this is my string";
	      String b=" anotherstring";
	      System.out.println("no.1:" + a.charAt(2));
	      System.out.println("no.2:" + a.length());
	     
	      System.out.println("no.3:" + a.replace('i', 'I'));
	      System.out.println("no.4:" + a.equals(b));
	      System.out.println("no.5:" + a.equalsIgnoreCase(a));
	      System.out.println("no.6:" + a.isEmpty());
	      System.out.println("no.7:" + a.concat(b));
	      System.out.println("no.8:" + a.equals(b));
	      System.out.println("no.9:" + a.contains(a));
	      System.out.println("no.10:" + a.substring(3, 5));
	      System.out.println("no.11:" + a.substring(3));
	      
	      
	      StringBuffer name = new StringBuffer(a);
	      System.out.println("no.12 reverse the text :"+ name.reverse());
	}

}
