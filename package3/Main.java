package package3;

public class Main {
	public static void main(String[] args) {
		HW_3_Student student1 = new HW_3_Student("Chandler", 10);
		HW_3_Student student2 = new HW_3_Student("Ross", 9);
		HW_3_Student student3 = new HW_3_Student("Joye", 8);

		int[] Ratings = new int[] { student1.getStudentRating(), student2.getStudentRating(), student3.getStudentRating() };

		// before ratings change
		System.out.println(HW_3_Student.BetterStudent(student1, student2));
		student3.printStudentInfo();
		System.out.println("1st Average Rating: " + HW_3_Student.AverageRating(Ratings));

		student1.changeRating(11);
		student2.changeRating(12);
		student3.changeRating(13);

		// after ratings change
		System.out.println(HW_3_Student.BetterStudent(student1, student2));
		student3.printStudentInfo();
		Ratings = new int[] { student1.getStudentRating(), student2.getStudentRating(), student3.getStudentRating() };
		System.out.println("2nd Average Rating: " + HW_3_Student.AverageRating(Ratings));
	}
}
