import java.util.Scanner;

public class UserInterface {

	static Scanner kb = new Scanner(System.in);
	static String studentName;

	public UserInterface() {
	}

	public void printMenu() {
		System.out.println("Welcome to your student gradebook.");
		System.out.println("Please select an option.");
		System.out.println("1. Add a student");
		System.out.println("2. Remove a student");
		System.out.println("3. Add a student's score");
		System.out.println("4. Remove a student's score");
		System.out.println("5. Display a student's name and scores");
		System.out.println("6. Display a student's average");
		System.out.println("7. Display all student's names and scores");
		System.out.println("8. Exit");
		System.out.println();
	}

	public String printAddStudentPrompt() {
		System.out.print("Please enter student's name to add: ");
		return kb.next();
	}

	public String printRemoveStudentPrompt() {
		System.out.print("Please enter student's name to remove: ");
		return kb.next();
	}

	public void addStudentScorePrompt(GradeBook gb) {
		System.out.print("Please enter student's name to add a score to: ");
		studentName = kb.next();
		if (gb.studentExist(studentName)) {
			System.out.print("What score would you like to add? ");
			gb.getStudent(studentName).addScore(kb.nextInt());
			System.out.println("Score successfully added.");
		} else {
			System.out.println("Student does not exist.");
		}
	}

	public void removeStudentScorePrompt(GradeBook gb) {
		System.out.print("Please enter student's name to remove score from: ");
		studentName = kb.next();
		if (gb.studentExist(studentName)) {
			gb.getStudent(studentName).printScores();
			System.out.print("What score would you like to remove? ");
			int score = kb.nextInt();
			if (gb.getStudent(studentName).searchScores(score)) {
				gb.getStudent(studentName).removeScore(score);
				System.out.println("Score successfully removed.");
			} else {
				System.out.println("Score does not exist.");
			}
		} else {
			System.out.println("Student does not exist.");
		}
	}

	public void displayStudentInfo(GradeBook gb) {
		System.out
				.print("Please enter student's name you would like to view: ");
		studentName = kb.next();
		if (gb.studentExist(studentName)) {
			System.out.println(gb.getStudent(studentName).getName());
			gb.getStudent(studentName).printScores();
		} else {
			System.out.println("Student does not exist.");
		}
	}

	public void displayStudentAverage(GradeBook gb) {
		System.out
				.println("Please enter student's name you would like to see the average from: ");
		studentName = kb.next();
		if (gb.studentExist(studentName)) {
			System.out.println(studentName + "'s average is "
					+ gb.getStudent(studentName).getAverage());
		} else {
			System.out.println("Student does not exist.");
		}
	}
	
	public void displayClassInfo(GradeBook gb) {
		for(int i = 0; i < gb.getNumOfStudents(); i++) {
			System.out.println(gb.getStudent(i).getName());
			gb.getStudent(i).printScores();
		}
	}
	public void goodbyeMessage() {
		System.out.println("Goodbye!");
	}

	public void invalidMessage() {
		System.out.println("Invalid input. Please try again.");
	}

	public void clear() {
		for (int i = 0; i < 22; i++) {
			System.out.println();
		}
	}
}
