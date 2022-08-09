package iterator;

public class Loop {

	public static void main(String[] args) {
		

		int sum = 1;
		for (int i = 1; i <= 20; i++) {
			sum = sum + i;
			System.out.println(sum * i);
		}
		System.out.println("ex 1:" + sum);

	}
}
