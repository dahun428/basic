package oop2;

public class Student {
	
	String studentName; //학생이름
	int classNum;	//반
	int studentId; //번호
	int korScore, engScore, mathScore; //국어, 영어, 수학점수
	int totalScore;
	int avgScore;
	
	public Student() {
		
	}
	//총점
	int sum() {
		int totalScore = korScore + engScore + mathScore;
		this.totalScore = totalScore;
		return totalScore;
	}
	//평균
	int avg() {
		int avgScore = totalScore/3;
		this.avgScore = avgScore;
		return avgScore;
	}
	//조회
	void display() {
		System.out.print(studentName+"\t");
		System.out.print(classNum+"\t");
		System.out.print(studentId+"\t");
		System.out.print(korScore+"\t");
		System.out.print(engScore+"\t");
		System.out.print(mathScore+"\t");
		System.out.print(totalScore+"\t");
		System.out.println(avgScore);
	}
	public Student(String studentName, int classNum, int studentId, int korScore, int engScore, int mathScore) {
		
		this.studentName = studentName;
		this.classNum = classNum;
		this.studentId = studentId;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		
	}
	
	
	
	
	
	
	
}
