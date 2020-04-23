import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		//Create scanner object 1
		Scanner input = new Scanner(System.in);
		//Output the prompt
		System.out.println("Enter some text:  ");
		//Wait for user to enter text
		String line = input.nextLine();
		//Show user what they entered
		System.out.println("Text entered:  " + line);
		
		//Create scanner object 2
		Scanner input1 = new Scanner(System.in);
		//Output the prompt
		System.out.println("Enter some number:  ");
		//Wait for user to enter text
		int value = input1.nextInt();
		//Show user what they entered
		System.out.println("Number entered:  " + value);
		
		//Create scanner object 3
		Scanner input2 = new Scanner(System.in);
		//Output the prompt
		System.out.println("Enter some number:  ");
		//Wait for user to enter text
		double value2 = input2.nextDouble();
		//Show user what they entered
		System.out.println("Number entered:  " + value2);
	}
}