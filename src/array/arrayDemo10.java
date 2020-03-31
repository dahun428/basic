package array;

import java.util.Scanner;

public class arrayDemo10 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String [] names = new String[3];
		int[] prices = new int[3];
		int[] amounts = new int[3];
		
		//상품명, 가격, 구매수량을 입력받는다.
		
		for(int i = 0; i < names.length; i++) {
			System.out.print("상품명을 입력하세요 : ");
			String name = sc.next();
			System.out.println("가격을 입력하세요  : ");
			int price = sc.nextInt();
			System.out.println("구매수량을 입력하세요 : ");
			int amount = sc.nextInt();
		}
		
		//구매 정보 출력하기
		System.out.println("순번     상품명  가격     수량     구매가격");
		System.out.println("=============================");
		int totalOrderPrice = 0;
		for(int i =0; i<names.length; i++) {
			System.out.println(i+1+"\t");
			System.out.println(names[i] + "\t");
			System.out.println(prices[i] + "\t");
			System.out.println(amounts[i] + "\t");
			System.out.println(prices[i] * amounts[i]);
			
			totalOrderPrice += prices[i] * amounts[i];
		}
		System.out.println("=============================");
		System.out.println("총 구매 가격                           "  + totalOrderPrice);
	}
	

}
