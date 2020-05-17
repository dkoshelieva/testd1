package package5_HW5;

public class EvenOdd {
	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 2, 3, 4, 5 };

		long evenSum = 0;
		long oddSum = 0;

		for (int i = 0; i < numbers.length; i++) {
			int n = numbers[i];
			if (n % 2 == 0) {
				evenSum += n;
			} else {
				oddSum += n;
			}
		}
		System.out.println("Sum even: " + evenSum);
		System.out.println("Sum odd: " + oddSum);
	}
}