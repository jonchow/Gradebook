import java.util.ArrayList;

public class Student {

	private String name;
	private double average = 0;
	private ArrayList<Integer> scores = new ArrayList<Integer>();

	public Student() {

	}

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getAverage() {
		for (int score : scores) {
			average = average + score;
		}
		average = average / scores.size();
		return average;
	}

	public boolean searchScores(int score) {
		for (int i : scores) {
			if (i == score) {
				return true;
			}
		}
		return false;
	}

	public void printScores() {
		for (int i : scores) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public void addScore(int score) {
		scores.add(score);
	}

	public void removeScore(int score) {
		if (scores.contains(score)) {
			int index = scores.indexOf(score);
			scores.remove(index);
		}
	}

}
