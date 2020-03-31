package oop2;

import java.util.Scanner;

public class StudentDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int savePoint = 0;
		
		Student[] stuArray = new Student[100];
		
		while(true) {

			System.out.println();
			System.out.println("================================");
			System.out.println("1.조회	2.검색	3.입력	0.종료");
			System.out.println("================================");
			System.out.println();
			int inputNum = sc.nextInt();
			
			
			//조회
			if(inputNum == 1) {

				System.out.println();
				System.out.println("=========================================================");
				System.out.println("학생이름	반	번호	국어점수	영어점수	수학점수	총점	평균");
				System.out.println("=========================================================");
				
				for(int i = 0; i < savePoint; i++) {
					Student stu = stuArray[i];
					stu.display();
				}
			//검색	
			}else if(inputNum ==2) {
				
				System.out.print("검색하고자하는 학생이름을 입력하세요 : ");
				String studentName = sc.next();
				
				System.out.println();
				System.out.println("=========================================================");
				System.out.println("학생이름	반	번호	국어점수	영어점수	수학점수	총점	평균");
				System.out.println("=========================================================");
				
				
				for(int i = 0; i < savePoint; i++) {
					Student stu = stuArray[i];
					if(studentName.equals(stu.studentName)) {
						stu.display();
						break;
					}else {
						System.out.println("해당하는 학생의 이름이 없습니다. 다시 입력해주세요");
					}
				}
				
			//입력	
			}else if(inputNum ==3) {
				
				System.out.print("학생이름을 입력하세요 : ");
				String studentName = sc.next();
				
				System.out.print("반을 입력하세요 : ");
				int classNum = sc.nextInt();
				
				System.out.print("학생번호을 입력하세요 : ");
				int studentId = sc.nextInt();
								
				System.out.print("국어점수를 입력하세요 : ");
				int korScore = sc.nextInt();
								
				System.out.print("영어점수를 입력하세요 : ");
				int engScore = sc.nextInt();
				
				System.out.print("수학점수를 입력하세요 : ");
				int mathScore = sc.nextInt();
				
				Student stu = new Student(studentName, classNum, studentId, korScore, engScore, mathScore);
				stu.sum();
				stu.avg();
				stuArray[savePoint] = stu;
				savePoint++;
				
			//종료	
			}else if(inputNum ==0) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				sc.close();
				
			}else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
				
			}
			
		}
		
		
	}
	
	
	
}
