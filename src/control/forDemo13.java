package control;

import java.util.Scanner;

public class forDemo13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 5자리 숫자를 입력하세요 ( 10000 ~ 99999)");
		int inputNum = sc.nextInt();
		
		int sum = 0;
		int[] array = new int[5]; 
	
		
		while(inputNum != 0) {
			
			sum += inputNum%10;
			
			inputNum /= 10;
		}
		System.out.println("합계 : " + sum);
	}

}
