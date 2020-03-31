package oop1;

import java.util.Scanner;

public class orderDemo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		Order[] orders = new Order[100];
		int savePoint = 0;
		
		while(true) {
			System.out.println();
			System.out.println("	     상품권 관리 프로그램");
			System.out.println("===================================");
			System.out.println("1.조회	2.검색	3.입력	4.종료");
			System.out.println("===================================");
			int menuNum = sc.nextInt();
			
			//조회
			if(menuNum == 1) {
				System.out.println("[고객 주문내용 조회]");
				
				if(savePoint ==0) {
					System.out.println("고객 주문 내용이 존재하지 않습니다.");
				}
				System.out.println("고객명	고객등급	총구매금액	적립포인트	사은품");
				System.out.println("========================================");
				
				for(int i = 0; i < savePoint; i++) {
					Order order = orders[i];
					System.out.print(order.name + "\t");
					System.out.print(order.grade+ "\t");
					System.out.print(order.price+ "\t");
					System.out.print(order.point+ "\t");
					System.out.println(order.gift);
				}
				
				
			//검색	
				
			}else if(menuNum ==2) {
				
				System.out.print("이름을 입력하세요 : ");
				String option = sc.next();
				
				System.out.print("검색조건을 입력하세요(N,G) : ");
				String text = sc.next();
				
				if(text.equalsIgnoreCase("N")) {
					
				}else if(text.equalsIgnoreCase("G")) {
					
				}else {
					System.out.println("잘못된 입력입니다. 다시 입력해주세요");
				}
				
				System.out.println("고객명	고객등급	총구매금액	적립포인트	사은품");
				System.out.println("========================================");
				
				for(int i = 0; i < savePoint; i++) {
					Order order = orders[i];
					
					boolean isFound = false;
					
					if(option.equalsIgnoreCase("N") && text.equals(order.name)) {
						isFound = true;
					}else if(option.equalsIgnoreCase("G") && text.equals(order.gift)) {
						isFound = true;
					}
					
					if(isFound) {
						System.out.print(order.name + "\t");
						System.out.print(order.grade+ "\t");
						System.out.print(order.price+ "\t");
						System.out.print(order.point+ "\t");
						System.out.println(order.gift);
					}
					
				}
				
			//입력	
			}else if(menuNum ==3) {
				System.out.println("[고객 주문내용 입력]");
				
				System.out.print("고객 이름을 입력해주세요 : ");
				String name = sc.next();
				System.out.print("고객 등급을 입력해주세요 (클래식,베스트,에이스,프리미어) : ");
				String grade = sc.next();
				System.out.print("총 구매 금액을 입력해주세요 : ");
				int price = sc.nextInt();
				
				Order order = new Order();
				order.name = name;
				order.grade = grade;
				order.price = price;
				
				if(order.grade.equals("클래식")) {
					order.point = (int)(price * 0.01);
				}else if(order.grade.equals("베스트")) {
					order.point = (int)(price * 0.02);
				}else if(order.grade.equals("에이스")) {
					order.point = (int)(price * 0.03);
				}else if(order.grade.equals("프리미어")) {
					order.point = (int)(price * 0.05);
				}else {
					System.out.println("유효하지 않은 등급입니다.");
					System.out.println("다시 입력해주세요");
				}
				if(order.price >= 5000000) {
					order.gift = "숙박권";
				}else if(order.price >= 1000000) {
					order.gift = "상품권";
				}else if(order.price >= 500000) {
					order.gift = "할인권";
				}else {
					order.gift = "주차권";
				}
				orders[savePoint] = order;
				savePoint++;
				
			//종료	
			}else if(menuNum ==4){
				System.exit(0);
			}
	
		}
		
		
		
	}

}
