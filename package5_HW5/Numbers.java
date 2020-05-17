package package5_HW5;

public class Numbers {
	public static void main(String[] args) {

		for (int a = 1; a <= 10; a++) {
			if (a == 5) {
				System.out.printf("Value is: five \n");
				continue;
			}
			if (a == 7) {
				continue;
			}
			System.out.printf("Value is: %d\n", a);
		}
		
	System.out.println("===========================================");
		
		for (int b = 20; b >= 0; b--) {
			if (b == 5) {
				System.out.printf("Value is: five \n");
				continue;
			}
			if (b == 7) {
				continue;
			}
			System.out.printf("Value is: %d\n", b);
		}
	}
}