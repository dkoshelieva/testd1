package package3;

public class HW_3_Student {
	private String StudentName;
	private int StudentRating;

	public HW_3_Student() {
	};

	public HW_3_Student(String StudentName, int StudentRating) {
		this.StudentName = StudentName;
		this.StudentRating = StudentRating;
	}

	public String getStudentName() {
		return this.StudentName;
	}

	public int getStudentRating() {
		return this.StudentRating;
	}

	public void changeRating(int number) {
		this.StudentRating = number;
	}

	public void printStudentInfo() {
		System.out.println(String.format("Name: %s, Rating: %d", this.StudentName, this.StudentRating));
	}

	public String toString() {
		String studentInfo = String.format("Name: %s, Rating: %d", this.StudentName, this.StudentRating);
		return studentInfo;
	}
	
	public static boolean BetterStudent(HW_3_Student s1, HW_3_Student s2) {
		int value1 = s1.getStudentRating();
		int value2 = s2.getStudentRating();
		if (value1 > value2) {
			System.out.println("Student 1 - better student with rating " + value1);
			return true;
		}
		System.out.println("Student 2 - better student with rating " + value2);
		return false;
	}

	public static int sum(int[] R) {
		int sum = 0;
		for (int value : R) {
			sum += value;
		}
		return sum;
	}

	public static double AverageRating(int[] R) {
		int sum = sum(R);
		double avg = (double) sum / R.length;
		return avg;
	}
}
