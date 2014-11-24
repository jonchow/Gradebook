import java.util.Scanner;
import java.util.ArrayList;

public class Driver {

	static ArrayList<Student> students = new ArrayList<Student>();
	static GradeBook gb = new GradeBook();
	static UserInterface ui = new UserInterface();
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		int choice = 0;
		String studentName;
		while (choice != 8) {
			ui.printMenu();
			choice = kb.nextInt();
			switch (choice) {
			case 1:
				studentName = ui.printAddStudentPrompt();
				gb.addStudent(studentName);
				ui.clear();
				break;
			case 2:
				studentName = ui.printRemoveStudentPrompt();
				gb.removeStudent(studentName);
				ui.clear();
				break;
			case 3:
				ui.addStudentScorePrompt(gb);
				ui.clear();
				break;
			case 4:
				ui.removeStudentScorePrompt(gb);
				ui.clear();
				break;
			case 5:
				ui.displayStudentInfo(gb);
				ui.clear();
				break;
			case 6:
				ui.displayStudentAverage(gb);
				ui.clear();
				break;
			case 7:
				ui.displayClassInfo(gb);
				ui.clear();
				break;
			case 8:
				ui.goodbyeMessage();
				ui.clear();
				break;
			default:
				ui.invalidMessage();
				ui.clear();
				break;
			}

		}
	}
}
