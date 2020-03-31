package control;

import java.util.Scanner;

public class forDemo7 {

	public static void main(String[] args) {

		//중첩 for문
//		for(int i = 1; i <=3; i++) {
//			System.out.println("i값: " + i);
//			for(int j = 1; j <= 5; j++) {
//				if( j >= 3) {
//					break;
//				}
//				System.out.println("i값 : " + i + ", j값 : "+j);
//			}
//		}
//		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 구구단을 입력하세요 : ");
		int dan  = sc.nextInt();
		
		for(int i = dan; i <= dan; i++) {
			System.out.println( i + "단 구구단");
			for(int j = 1; j <=9; j++) {
				
				System.out.println( i + " * " +j +" = "+ i*j);
			}
		}
		
		sc.close();
		
	}

}
