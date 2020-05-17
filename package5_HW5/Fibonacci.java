package package5_HW5;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println("Enter Number:  ");
		Scanner eneteredValue = new Scanner(System.in);
		int index = eneteredValue.nextInt();

		if (index < 0) {
			System.out.println("Incorrect number");
			return;
		}

		int f1 = 0, f2 = 1, i;
		System.out.print("Fibonacci order: ");

		for (i = 0; i < index; i++) {
			System.out.print(f1 + ", ");
			int next = f1 + f2;
			f1 = f2;
			f2 = next;
		}
	}
}