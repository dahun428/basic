package oop1;

import java.util.Scanner;

public class ScoreDemo1 {

	public static void main(String[] args) {
		
		/*
		 * 학생의 이름, 국어, 영어, 수학 점수를 입력 받아서 배열에 저장한다.
		 * 배열에 저장된 학생성적정보를 출력할 수 있다.
		 * 배열에 저장된 학생성적 정보를 검색할 수 있다.
		 */
		
		Scanner sc = new Scanner(System.in);
		Score[] scores = new Score[100];
		int savePosition = 0;
		
		while(true) {
			System.out.println();
			System.out.println("======================================");
			System.out.println("1.조회	2.검색	3.입력	4.수정	0.종료");
			System.out.println("======================================");
			System.out.print("번호를 입력하세요 : ");
			
			int menuNo = sc.nextInt();
			
			//조회
			if(menuNo == 1) {
				System.out.println("[성적 조회]");
				System.out.println("순번	이름	국어	영어	수학	총점	 평균");
				System.out.println("--------------------------------------");
				for(int i = 0; i < savePosition; i++) {
					Score score = scores[i];
					System.out.print(i+1+"\t");
					System.out.print(score.studentName+"\t");
					System.out.print(score.kor+"\t");
					System.out.print(score.eng+"\t");
					System.out.print(score.math+"\t");
					System.out.print(score.total+"\t");
					System.out.println(score.average);
				
				}
				
			//검색	
			}else if(menuNo ==2) {
				System.out.println("[성적 검색]");
				
				System.out.print("조회할 학생이름을 입력하세요  : ");
				String searchName = sc.next();
				
				Score foundScore = null;
				
				for(int i = 0; i < savePosition; i++) {
					Score score = scores[i];
					if(searchName.equals(score.studentName)) {
						foundScore = score;
						break;
					}
				}
						
				if(foundScore != null) {
					System.out.println("[조회 결과]");
					System.out.println("---------------------");
					System.out.println("학생 이름 : " + foundScore.studentName);
					System.out.println("국어 점수 : " + foundScore.kor);
					System.out.println("영어 점수 : " + foundScore.eng);
					System.out.println("수학 점수 : " + foundScore.math);
					System.out.println("총	점  : " + foundScore.total);
					System.out.println("평	균 : " + foundScore.average);
					System.out.println("합격 여부 : " + foundScore.isPassed);
					System.out.println("----------------------");
				} else {
					System.out.println("["+searchName+"] 과 일치하는 학생정보를 찾을 수 없습니다.");
				}
				
			//입력	
			}else if(menuNo ==3) {
				System.out.println("[성적정보 입력]");
				
				System.out.print("이름을 입력하세요 : ");
				String name = sc.next();
				System.out.print("국어 점수를 입력 하세요 : ");
				int kor = sc.nextInt();
				System.out.print("영어 점수를 입력하세요 : ");
				int eng = sc.nextInt();
				System.out.print("수학점수를 입력하세요 : ");
				int math = sc.nextInt();
		
				Score score = new Score();
				score.studentName = name;
				score.kor = kor;
				score.eng = eng;
				score.math = math;
				score.total = kor + eng + math;
				score.average = score.total/3;
				score.isPassed = (score.average >= 60 ? true : false);
				
				scores[savePosition] = score;
				savePosition++;
			
			//수정	
			}else if(menuNo ==4){
				
				
				Score foundScore = null;
				System.out.println("[성적정보 변경]");
				System.out.print("성적을 변경할 학생의 이름을 입력하세요 : ");
				String searchName = sc.next();
				
				for(int i = 0; i < savePosition; i++) {
					Score score = scores[i];
					if(searchName.equals(score.studentName)) {
						foundScore = score;
						break;
					}
				}
				
				if(foundScore != null) {
				
					System.out.print("성적을 변경할 과목명을 입력하세요 (국어, 영어, 수학) : ");
					String searchSubject = sc.next();
					if(searchSubject.equals("국어")) {
						System.out.print("점수를 입력하세요 : ");
						int kor = sc.nextInt();
						foundScore.kor = kor;
						System.out.println("수정이 완료 되었습니다.");
					}else if(searchSubject.equals("영어")) {
						System.out.print("점수를 입력하세요 : ");
						int eng = sc.nextInt();
						foundScore.eng = eng;
						System.out.println("수정이 완료 되었습니다.");
					}else if(searchSubject.equals("수학")) {
						System.out.print("점수를 입력하세요 : ");
						int math = sc.nextInt();
						foundScore.math = math;
						System.out.println("수정이 완료 되었습니다.");
					}else {
						System.out.println("["+searchSubject+"] 과 일치하는 과목을 찾을 수 없습니다.");
					}
					foundScore.total = foundScore.kor + foundScore.eng + foundScore.math;
					foundScore.average = foundScore.total/3;
					foundScore.isPassed = (foundScore.average >= 60 ? true : false);
				}else {
					System.out.println("["+searchName+"] 과 일치하는 학생정보를 찾을 수 없습니다.");
				}
				
			//종료	
			}else if(menuNo ==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			
		}
		
	}
	
	
}
