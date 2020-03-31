package control;

import java.util.Scanner;

public class ifDemo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("등급을 입력해주세요  : ");
		String grade = sc.next();
		
		switch (grade) {
		case "vvip":
			System.out.println("vvip고객님 방문을 환영합니다.");
			System.out.println("오늘은 10분 한정 프리미엄 포도주 증정이 있습니다.");
			break;
		case "vip":
			System.out.println("vip 고객님 방문을 환영합니다.");
			System.out.println("오늘은 30분 한정 고급 식기세트 증정이 있습니다.");
			break;
		case "classic":
			System.out.println("classic 고객님 방문을 환영합니다.");
			System.out.println("오늘은 50분 한정 면 마스크 증정이 있습니다.");
			break;
		default:
			System.out.println("손님 방문을 환영합니다.");
			System.out.println("오늘은 100분 한정 주차권할인 행사가 있습니다.");
			break;
		}
		sc.close();
	}

}
