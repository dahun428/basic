package control;

import java.util.Scanner;

public class ifDemo2 {

	public static void main(String[] args) {

		String grade = null;
		int totalPrice = 0;
		int discountPrice = 0;
		int isPayPrice = 0;
		int point = 0;
				
		Scanner sc = new Scanner(System.in);
		System.out.print("등급을 입력해주세요 \n 일반, 로얄, 플래티넘 중 1개 입력 : ");
		grade = sc.nextLine();
		System.out.print("총 구매금액을 입력해주세요 : ");
		totalPrice = sc.nextInt();
		
		if(grade.equals("일반")) {
			discountPrice = (int)(totalPrice * 0.01);
		}else if(grade.equals("로얄")) {
			discountPrice = (int)(totalPrice * 0.03);
		}else if(grade.equals("플래티넘")) {
			discountPrice = (int)(totalPrice * 0.9);
		}
		isPayPrice = totalPrice - discountPrice;
		point = (int)(isPayPrice * 0.03);
		
		System.out.println("");
		System.out.println("총 구매 금액 : " + totalPrice);
		System.out.println("고객등급  : " +  grade);
		System.out.println("할인된금액 : " + discountPrice);
		System.out.println("결재할 금액 : " + isPayPrice);
		System.out.println("적립된 포인트 : " + point);
		
		sc.close();
	}

}
