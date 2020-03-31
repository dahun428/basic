package operate;

import java.util.Scanner;

public class operator11 {

	public static void main(String[] args) {
		
		String customerName;
		String productName;
		int price; //상품가격
		int amount; //상품 수량
		double usePoint; //사용 포인트
		int payPrice; //구매가격
		int realPayPrice; //결재금액
		double inPoint; //적립포인트
			
		Scanner sc = new Scanner(System.in);
		System.out.print("고객 이름을 입력하세요 : ");
		customerName = sc.nextLine();
		System.out.print("상품 이름을 입력하세요 : ");
		productName = sc.nextLine();
		System.out.print("구매수량을 입력하세요 : ");
		amount = sc.nextInt();
		System.out.print("가격을 입력하세요 : ");
		price = sc.nextInt();
		System.out.println("사용할 포인트를 입력하세요 : ");
		usePoint = sc.nextDouble();
		
		payPrice = price * amount;
		realPayPrice = (int) (payPrice - usePoint);
		inPoint = realPayPrice * 0.03;
		
		System.out.println();
		System.out.println("---------영수증--------");
		System.out.println("고객명 : " + customerName);
		System.out.println("상품명 : " + productName);
		System.out.println("상품가격 : " + price);
		System.out.println("구매가격 : " + payPrice);
		System.out.println("사용포인트 : " + usePoint);
		System.out.println("결재금액 : " + realPayPrice);
		System.out.println("적립포인트 : " + inPoint);
		
		sc.close();
	}

}
