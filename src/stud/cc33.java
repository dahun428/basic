package stud;

import java.util.Comparator;
import java.util.stream.Stream;

public class cc33 {
	
	public static void main(String[] args) {
		
		Stream<Student> studentStream = Stream.of(
				new Student("이자바", 4, 500),		
				new Student("김자바", 6, 200),		
				new Student("박자바", 7, 400),		
				new Student("소자바", 1, 100)	
				);
		studentStream.sorted(Comparator.comparing(Student::getBan)
				.thenComparing(Comparator.naturalOrder()))
				.forEach(System.out::println);
	}
		
}
	
class Student implements Comparable<Student>{
	
	String name;
	int ban;
	int totalScore;
	
	
	public Student() {}
	
	public Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore);
	}
	
	public String getName() {
		return name;
	}

	public int getBan() {
		return ban;
	}

	public int getTotalScore() {
		return totalScore;
	}

	//총점 내림차순을 기본 정렬로한다.
	@Override
	public int compareTo(Student o) {
		return o.totalScore - this.totalScore;
	}
	
	
}