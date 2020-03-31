package oop4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ProductDemo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		ProductService service = new ProductService();
		
		while(true) {
			
			System.out.println();
			System.out.println("		[상품 관리 프로그램]");
			System.out.println("================================================");
			System.out.println("=	1.조회	2.입고	3.출고	4.검색	0.종료   =");
			System.out.println("================================================");
			System.out.print("메뉴를 선택하세요 : ");
			
			int menuNo = sc.nextInt();
			
			//조회
			if(menuNo == 1) {
				
				service.printAllProduct();
	
			//입고
			}else if(menuNo == 2) {
								
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("=====================================");
				System.out.println("=   1.신규상품   2.이월상품   3.재고추가  	    =" );
				System.out.println("=====================================");
				
				System.out.print("메뉴를 선택하세요 :  ");
				int stockMenuNo = sc.nextInt();
				
				
				//신규상품
				if(stockMenuNo == 1) {
					
					System.out.println();
					System.out.println("신규 상품 입고 정보를 입력해주세요");
					System.out.print("상품명   :  ");
					String name = sc.next();
					System.out.print("제조사   :   ");
					String maker = sc.next();
					System.out.print("카테고리   :   ");
					String category = sc.next();
					System.out.print("가격   :   ");
					int price = sc.nextInt();
					System.out.print("입고량    :   ");
					int stock = sc.nextInt();
					
					Product product = new Product(name, maker, category, price, stock);
					service.insertProduct(product);
			
					
				//이월상품
				}else if(stockMenuNo == 2) {
					
					System.out.println();
					System.out.println("이월 상품 입고 정보를 입력해주세요");
					System.out.print("상품명   :  ");
					String name = sc.next();
					System.out.print("제조사   :   ");
					String maker = sc.next();
					System.out.print("카테고리   :   ");
					String category = sc.next();
					System.out.print("가격   :   ");
					int price = sc.nextInt();
					System.out.print("할인율 :   ");
					double discountRate = sc.nextDouble();
					System.out.print("입고량    :   ");
					int stock = sc.nextInt();
					//상품명, 제조사, 카테고리, 가격, 할인율, 입고량을 입력받아서 입고처리
					
					
					Product product = new Product(name, maker, category, stock, price, discountRate);
					service.insertProduct(product);
									
					
				//재고추가	
				}else if(stockMenuNo == 3) {
		
					
					System.out.println();
					System.out.print("재고 추가 정보를 입력해주세요 ");
					System.out.print("상품명   :  ");
					String name = sc.next();
					System.out.print("입고량    :   ");
					int amount = sc.nextInt();
					service.addProductStock(name, amount);
				}
				
				//출고
			}else if(menuNo == 3) {
				System.out.println();
				System.out.println("			[상품 출고 처리]");
				System.out.print("출고할 상품명을 입력해주세요 : ");
				String name = sc.next();
				System.out.print("출고량을 입력해주세요 : ");
				int amount = sc.nextInt();
				
				service.exportProduct(name, amount);
				
				//검색
			}else if(menuNo == 4) {
				
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("		[상품 검색]");
				System.out.println("=============================================");
				System.out.println("=	1.이름	2.제조사	3.카테고리	4.가격	    =");
				System.out.println("=============================================");
				System.out.print("검색방식을 선택하세요 :  ");
				
				int searchMenuNo = sc.nextInt();
				
				
				//이름검색
				if(searchMenuNo == 1) {
					
					System.out.println();
					System.out.print("검색할 상품명을 입력하세요  : ");
					String name = sc.next();
					service.printProductsByName(name);
					
				
				//제조사검색	
				}else if(searchMenuNo == 2) {
					
					System.out.println();
					System.out.print("검색할 제조사 명을 입력하세요 : ");
					String maker = sc.next();
					service.printProductsByMaker(maker);
					
					
					//제조사를 입력받아서 상품 검색
					//제조사의 검색기능을 실행
					
//					service.printProductsByMaker(maker);
					
					
				//카테고리검색	
				}else if(searchMenuNo == 3) {
					
					System.out.println();
					System.out.print("검색할 카테고리 명을 입력하세요 : ");
					String category = sc.next();
					service.printProductsByCategory(category);
					//카테고리를 입력받아서 상품 검색
					//서비스의 카테고리 검색기능을 실행

//					service.printProductsByCategory(category);
					
				//가격 검색	
				}else if(searchMenuNo == 4) {
					
					System.out.println();
					System.out.print("검색할 최대가격을 입력하세요 : ");
					int maxPrice = sc.nextInt();
					System.out.print("검색할 최소가격을 입력하세요 : ");
					int minPrice = sc.nextInt();
					
					//최소가격과 최대가격 입력받아서 그 가격 범위내의 상품 검색
					//서비스의 가격 검색 기능을 실행
					
					service.printProductsByPrice(minPrice, maxPrice);
					
				}
							
				//종료
			}else if(menuNo == 0) {
				
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				
			}else {
				System.out.println("올바르지 않은 접근입니다. 다시 메뉴를 입력해주세요");
			}
			
			
		}
		
	}

}
