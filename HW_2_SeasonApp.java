import java.util.Scanner;

public class HW_2_SeasonApp {
			
	public enum Season {
		WINTER, SPRING, SUMMER, AUTUMN
	}
		
	public static void main(String[] args) {
	
		System.out.println("Enter Month:  ");
		Scanner eneteredValue = new Scanner(System.in);
		String currentMonth = eneteredValue.nextLine();
	
		switch (currentMonth) {
		case "December":
		case "January":
		case "February":
			System.out.println(Season.WINTER);
			break;
		case "March":
		case "April":
		case "May":
			System.out.println(Season.SPRING);
			break;
		case "June":
		case "July":
		case "August":
			System.out.println(Season.SUMMER);
			break;
		case "September":
		case "October":
		case "November":
			System.out.println(Season.AUTUMN);
			break;
		default:
			System.out.println("No such month. Please verify");
		}
	}
}