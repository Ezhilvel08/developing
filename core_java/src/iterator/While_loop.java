package iterator;

public class While_loop {
	
	public static void iterate() {
		
		int num = 10;
		int i=1;   // initialization
		while (i<=50) {  // condition
			int sum= num+i; // statement
			System.out.println(sum);
			i++; 			// increment
		}
		
	}

	public static void main(String[] args) {
		iterate();
		
	}

}
