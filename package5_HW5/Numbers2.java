package package5_HW5;

import java.util.Scanner;

public class Numbers2 {
	public static void main(String[] args) {

		System.out.println("Enter Number:  ");
		Scanner eneteredValue = new Scanner(System.in);
		int number = eneteredValue.nextInt();

		System.out.println("Enter Power:  ");
		Scanner eneteredValue2 = new Scanner(System.in);
		int power = eneteredValue2.nextInt();

		long result = number;
		for (int i = 1; i < power; i++) {
			result = number * result;
		}

		if (power == 0) {
			System.out.print(1);
		} else if (power < 0) {
			System.out.print("Incorrect power. Plese try positive");
		} else
			System.out.print(result);
	}

}