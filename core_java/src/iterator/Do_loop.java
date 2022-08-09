package iterator;

public class Do_loop {
	public static void do_loop() {
		int i = 0;

		do {

			int sum = 2 * i;
			System.out.println("Print sum:" + sum);
			i++;
		}

		while (i < 10);
	}

	public static void main(String[] args) {
		
		do_loop();
	}

}
