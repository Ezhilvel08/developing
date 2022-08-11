package inherit;

public class Single_inherit2 extends Single_inhert {
	 int sub() {
			
			int a=225;
			int b=520;
			int c=a-b;
			System.out.println(c);
			
			return  0;
		 }
			public static void main(String[] args) {
				
				Single_inherit2 cal =new Single_inherit2() ;
				cal.sub();
				cal.add();
				
			}
			
	
}
