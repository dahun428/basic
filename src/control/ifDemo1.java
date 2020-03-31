package control;

import java.util.Scanner;

public class ifDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매 금액을 입력해주세요 : ");
		int orderPrice= sc.nextInt();
		
		System.out.println();
		System.out.println("---------------------");
		System.out.println("상품권이 지급되었습니다. 확인해주세요");
		System.out.println("구매금액" + orderPrice +"원");
		if(orderPrice >= 5000000) {
			System.out.println("10만원 상품권 지급");
		}else if(orderPrice >= 1000000) {
			System.out.println("1만원 상품권 지급");
		}else if(orderPrice >= 500000) {
			System.out.println("커피쿠폰 지급");
		}else {
			System.out.println("주차할인권 지급");
		}
		
		
	}

}
