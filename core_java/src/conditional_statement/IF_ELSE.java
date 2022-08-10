package conditional_statement;

public class IF_ELSE {

	public static void main(String[] args) {
	

		int time1= 20;
		int time2= 20;
		// if else in integer
		if(time1==time2) {
			System.out.println("statement is correct ");
		}else {
			System.out.println("statement is wrong");
		}
		 // ternory operator are store in string because output is string
		String result1 =(time1<time2)? "statement is correct" :"statement is wrong";
		System.out.println(result1);
		
		// if else in String
		String a="apple";
		String b="ball";
		
		if(a.equals(b)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		String result2=(a!=b)? "true":"false";
		System.out.println(result2);
	}
	

}
