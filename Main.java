
public class Main {
	public static void main(String[] args) {
		int myTestIntNumber;
		short myTestShort;
		long myTestLong;
		double myTestDouble;
		float myTestFloat;
		char myTestChar;
		boolean myTestBoolean;
		
		myTestIntNumber = 77;
		myTestShort = 528;
		myTestLong = 4444;
		myTestDouble = 8.3526;
		myTestFloat=35.7f;
		myTestChar = 'd';
		myTestBoolean = true;
		
		String text = "Hey";
		String blank = " ";
		String name = "Chandler!";
		String greeting = text + blank + name;
			
		System.out.println(myTestIntNumber);
		System.out.println(myTestShort);
		System.out.println(myTestLong);
		System.out.println(myTestDouble);
		System.out.println(myTestFloat);
		System.out.println(myTestChar);
		System.out.println(myTestBoolean);
		
		System.out.println(greeting);
		System.out.println("Hey " + "Chandler!");
		System.out.println("My int is: " + myTestIntNumber);
		System.out.println("My number is: " + myTestDouble);
	}

}
