import java.util.Scanner;

public class HW_2_LimitsOfTypesApp {
	
	public static void main(String[] args) {

		System.out.println("Enter Value:  ");
		Scanner enteredValue = new Scanner(System.in);
		String value = enteredValue.nextLine();

		switch (value) {
		case "boolean":
			System.out.println("TRUE boolean: " + Boolean.TRUE + "; " + "FALSE boolean: " + Boolean.FALSE);
			break;
		case "byte":
			System.out.println("MIN byte: " + Byte.MIN_VALUE + "; " + "MAX byte: " + Byte.MAX_VALUE);
			break;
		case "short":
			System.out.println("MIN short: " + Short.MIN_VALUE + "; " + "MAX short: " + Short.MAX_VALUE);
			break;
		case "character":
			System.out.println("MIN character: " + (Character.MIN_VALUE + 0) + "; " + "MAX character: "	+ (Character.MAX_VALUE + 0));
			break;
		case "integer":
			System.out.println("MIN integer: " + Integer.MIN_VALUE + "; " + "MAX integer: " + Integer.MAX_VALUE);
			break;
		case "long":
			System.out.println("MIN long: " + Long.MIN_VALUE + "; \n" + "MAX long: " + Long.MAX_VALUE);
			System.out.printf("MIN long: %,-27d\n", Long.MIN_VALUE);
			System.out.printf("MAX long: %,-27d\n", Long.MAX_VALUE);
			break;
		case "float":
			System.out.println("MIN float: " + Float.MIN_VALUE + "; \n" + "MAX float: " + Float.MAX_VALUE);
			System.out.printf("MIN float: %-27s\n", Float.MIN_VALUE);
			System.out.printf("MAX float: %,f\n", Float.MAX_VALUE);
			break;
		case "double":
			System.out.println("MIN double: " + Double.MIN_VALUE + "; \n" + "MAX double: " + Double.MAX_VALUE);
			System.out.printf("MIN double: %-27s\n", Double.MIN_VALUE);
			System.out.printf("MAX double: %s\n", Double.MAX_VALUE);
			break;
		default:
			System.out.println("No such type. Please verify");
		}
	}
}