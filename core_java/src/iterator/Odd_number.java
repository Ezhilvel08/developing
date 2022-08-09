package iterator;

public class Odd_number {

	public static void find_odd() {
		int sum ;
		for (int i = 0; i <=50; i++) {
			sum=i+1;
			if (sum%2!=0) {
			int odd_num =sum;
			System.out.println("odd num is:"+odd_num );
				
			}
		}
	}
	public static void main(String[] args) {
		find_odd();

	}

}
