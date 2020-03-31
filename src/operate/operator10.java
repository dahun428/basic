package operate;

import java.util.Scanner;

public class operator10 {

	public static void main(String[] args) {
		
		String name;
		int kor, eng, math;
		int sum;
		double avg;
		String pass, isPay;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요  : ");
		name = sc.nextLine();
		System.out.print("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		avg = sum / 3;
		pass = avg >= 60 ? "예" : "아니요";
		isPay = avg >= 96 ? "예" : "아니요";
		
		System.out.println();
		System.out.println("--------출력내용--------");
		System.out.println("이름 : " + name);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		System.out.println("합격여부 : " + pass);
		System.out.println("장학금지급여부 : " + isPay);
		
		sc.close();
	}

}
