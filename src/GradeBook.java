import java.util.ArrayList;

public class GradeBook {
	private static ArrayList<Student> students = new ArrayList<Student>();
	private static int numOfStudents = 0;
	
	public GradeBook() {
	}
	
	public int getNumOfStudents() {
		return numOfStudents;
	}
	public boolean studentExist(String name) {
		for (Student i : students) {
			if (i.getName().equalsIgnoreCase(name))
				return true;
		}
		return false;
	}

	public Student getStudent(String name) {
		for (Student i : students) {
			if (i.getName().equalsIgnoreCase(name))
				return i;
		}
		return null;
	}

	public Student getStudent(int index) {
		return students.get(index);
	}

	public void addStudent(String name) {
		try {
			students.add(new Student(name));
			numOfStudents++;
			System.out.println("Student successfully added.");
		} catch (NullPointerException e) {
			System.out.println("Student could not be added.");
		}
	}

	public void removeStudent(String name) {
		for (Student i : students) {
			if (i.getName().equalsIgnoreCase(name)) {
				students.remove(i);
				numOfStudents--;
				System.out.println("Student successfully removed.");
				return;
			}
		}
		System.out.println("Student does not exist.");
	}
}
