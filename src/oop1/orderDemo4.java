package oop1;

import java.util.Scanner;

public class orderDemo4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		Order[] orders = new Order[100];
		int savePoint = 0;
		
		while(true) {
			System.out.println();
			System.out.println("	     상품권 관리 프로그램");
			System.out.println("===================================");
			System.out.println("1.조회	2.검색	3.입력	4.삭제	0.종료");
			System.out.println("===================================");
			int inputNum = sc.nextInt();
			//조회
			if(inputNum == 1) {
				System.out.println();
				System.out.println("고객명	고객등급	총구매금액	적립포인트	사은품");
				System.out.println("========================================");
				
				if(savePoint != 0) {
					for(int i = 0; i < savePoint; i++) {
						Order order = orders[i];
						System.out.print(order.name + "\t");
						System.out.print(order.grade+ "\t");
						System.out.print(order.price+ "\t");
						System.out.print(order.point+ "\t");
						System.out.println(order.gift);
						
					}	
				}else {
					System.out.println("해당 데이터가 없습니다.");
				}
				
				System.out.println();
				
				
			//검색	
				
			}else if(inputNum ==2) {
				System.out.print("검색조건을 입력하세요(N,G) : ");
				String search = sc.next();
				Order foundOrder = null;
				
				
				if(search.equalsIgnoreCase("N")) {
					System.out.print("키워드를 입력하세요(이름)  :  ");
					String name = sc.next();
					
					for(int i = 0; i < savePoint; i++) {
						Order order = orders[i];
						if(name.equals(order.name)) {
							foundOrder = order;
							break;
						}
					}
					if(foundOrder != null) {
						System.out.println("[조회 결과]");
						System.out.println("---------------------");
						System.out.println("고객명 : " + foundOrder.name);
						System.out.println("고객등급 : " + foundOrder.grade);
						System.out.println("총 구매 금액 : " + foundOrder.price +" 원");
						System.out.println("적립포인트 : " + foundOrder.point);
						System.out.println("사은품 : " + foundOrder.gift);
						
						System.out.println("----------------------");
					} else {
						System.out.println("["+name+"] 과 일치하는 고객정보를 찾을 수 없습니다.");
					}
					
				}else if(search.equalsIgnoreCase("G")) {
					System.out.print("키워드를 입력하세요(사은품)  :  ");
					String gift = sc.next();
					
					
					for(int i = 0; i < savePoint; i++) {
						Order order = orders[i];
						if(gift.equals(order.gift)) {
							foundOrder = order;
							
							System.out.println("[사은품 기준 조회 결과]");
							System.out.println("---------------");
							System.out.println("고객명 : " + foundOrder.name);
							System.out.println("고객등급 : " + foundOrder.grade);
							System.out.println("총 구매 금액 : " + foundOrder.price+" 원");
							System.out.println("적립포인트 : " + foundOrder.point);
							System.out.println("사은품 : " + foundOrder.gift);
							System.out.println("----------------------");
							
							if(i == savePoint) {
								break;
							}
						}else {
							continue;
						}
					}
					
				}else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				}
			
				
			//입력	
			}else if(inputNum ==3) {
				
				
				System.out.print("고객 이름을 입력해주세요 : ");
				String name = sc.next();
				System.out.print("고객 등급을 입력해주세요 (클래식,베스트,에이스,프리미어) : ");
				String grade = sc.next();
				boolean isOkgrade = false;
				if(grade.equals("클래식") || grade.equals("베스트") || grade.equals("에이스") || grade.equals("프리미어")) {
					isOkgrade = true;
				}
				if(isOkgrade) {
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
						
				}else {
					System.out.println("잘못된 입력 값입니다. 다시 입력해주세요");
				}
			//종료	
			}else if(inputNum ==0){
				System.exit(0);
			//삭제
			}else if(inputNum ==4) {
				
				Order foundName = null;
				System.out.println();
				System.out.print("삭제할 회원의 이름을 입력해주세요  : ");
				String name = sc.next();
				
				for(int i = 0; i < savePoint; i++) {
					Order order = orders[i];
					if(name.equals(order.name)) {
						foundName = order;
						break;
					}
				}
				if(foundName != null) {
					System.out.print("해당 고객의 데이터를 삭제하시겠습니까?  (예, 아니오)   :" );
					String confirm = sc.next();
					if(confirm.equals("예")) {
						
						for(int i = 0; i <savePoint; i++) {
							if(orders[i] == foundName) {
								for(int j = i; j < savePoint-1; j++) {
									orders[j] = orders[j+1];
								}
							}
						}
						savePoint--;
						
					}else if(confirm.equals("아니오")) {
						
					}else {
						System.out.println("정확하지 않은 명령입니다.");
					}
				}else {
					System.out.println("["+name+"] 과 일치하는 고객이름이 없습니다.");
				}
				
				
			}else {
				System.out.println("잘못된 입력 값입니다. 다시 입력해주세요");
			}
	
		}
		
		
		
	}

}
