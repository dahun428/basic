package operate;

import java.util.Scanner;

public class operator9 {

	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		str = sc.nextLine();
		System.out.println("반갑습니다 " + str + " 님.");
		
		
		System.out.print("상품명을 입력하세요  : ");
		String productName = sc.next();
		
		System.out.print("가격을 입력하세요 : ");
		int price = sc.nextInt();
		
		System.out.print("구매수량을 입력하세요 : ");
		int amount = sc.nextInt();
		
		System.out.print("고객 등급을 입력하세요 : ");
		String grade = sc.next();
		
		System.out.println();
		System.out.println("----------------");
		System.out.println("상품명 : " + productName);
		System.out.println("가격 : " + price);
		System.out.println("구매수량 : " + amount);
		System.out.println("고객등급 : " + grade);
	
		sc.close();
	}

}
