package control;

import java.util.Scanner;

public class forDemo5 {

	public static void main(String[] args) {

//1~100까지 숫자 중에서 3의 배수에 해당하는 숫자의 합계를 계산하기
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum+=i;
			}
		}
		System.out.println("1~100까지의 3의 배수의 합 : " + sum);
		
		
	}

}
