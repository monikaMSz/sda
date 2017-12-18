package sda;

public class Result {
	int resultId;
	int studentId;
	int score;
	String grade;

	Result(int resultId, int studentId, int score, String grade) {
		this.resultId = resultId;
		this.studentId = studentId;
		this.score = score;
		this.grade = grade;
	}
	public String toString(){
		return "score " + score + " = " + grade;
	}
}

