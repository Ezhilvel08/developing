package iterator;

public class Even_number {

	public static void find_even() {

		int sum1 = 1;
		for (int i = 1; i <= 20; i++) {
			sum1 = sum1 + 1;
			if (sum1 % 2 == 0) {
				int even_num=sum1;
				System.out.println("ex 2:" + even_num);
			}
		}

	}

	public static void main(String[] args) {

		find_even();

	}
}